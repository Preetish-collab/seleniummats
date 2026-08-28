import dotenv from 'dotenv';
import nodemailer from 'nodemailer';
import path from 'node:path';

export default async function globalTeardown() {
  console.log('TEARDOWN STARTED');
  dotenv.config({ path: path.resolve(process.cwd(), 'key.env') });

  const gmailUser = process.env.GMAIL_USER;
  const gmailAppPassword = process.env.GMAIL_APP_PASSWORD;
  const reportRecipient = process.env.REPORT_RECIPIENT;

  if (!gmailUser || !gmailAppPassword || !reportRecipient) {
    console.warn(
      'Skipping report email: set GMAIL_USER, GMAIL_APP_PASSWORD, and REPORT_RECIPIENT in key.env. Use a Gmail app password, not the account password.',
    );
    return;
  }

  const transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
      user: gmailUser,
      pass: gmailAppPassword,
    },
  });

  const reportPath = path.join(process.cwd(), 'playwright-report', 'index.html');
  const mailOptions = {
    from: gmailUser,
    to: reportRecipient,
    subject: 'Playwright Test Report',
    text: 'Find the attached HTML test report from the latest run.',
    attachments: [
      {
        filename: 'index.html',
        path: reportPath,
      },
    ],
  };

  try {
    await transporter.sendMail(mailOptions);
    console.log('Report email sent successfully!');
  } catch (error) {
    console.error('Failed to send report email:', error);
  }
  console.log('TEARDOWN FINISHED');
}