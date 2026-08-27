const winston = require("winston");
const path = require("path");
const fs = require("fs");
const loggingDir = path.resolve(__dirname, "..", "logging");
fs.mkdirSync(loggingDir, { recursive: true });

// Function to format log entries with timestamp and timezone
const customFormat = winston.format.printf(({ level, message, timestamp }) => {
  return `${timestamp} [${level}]: ${message}`;
});

// Set the desired timezone
//const timeZone = "Europe/London"; // For the UK
// const timeZone = 'America/New_York'; // For the US
const timeZone = "Asia/Kolkata"; // For India
const timestamp = () => new Intl.DateTimeFormat("en-IN", {
  dateStyle: "short",
  timeStyle: "medium",
  timeZone,
}).format(new Date());

const logger = winston.createLogger({
  format: winston.format.combine(
    winston.format.timestamp({ format: timestamp }),
    customFormat
  ),
  transports: [
    new winston.transports.Console({ level: "debug" }),
    new winston.transports.File({
      filename: path.join(loggingDir, "test_run.log"),
      maxFiles: 5, // Number of log files to retain
      maxsize: 300 * 1024, // 10 * 1024 ==10 KB, specify the size in bytes
      level: "info",
    }),
    new winston.transports.File({
      filename: path.join(loggingDir, "test_error.log"),
      maxFiles: 5, // Number of log files to retain
      maxsize: 10 * 1024, // 10 KB, specify the size in bytes
      level: "error",
    }),
  ],
});


module.exports = logger;