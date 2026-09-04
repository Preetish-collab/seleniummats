// @ts-check
const { defineConfig, devices } = require('@playwright/test');

/**
 * Read environment variables from file.
 * https://github.com/motdotla/dotenv
 */
// import dotenv from 'dotenv';
// import path from 'path';
// dotenv.config({ path: path.resolve(__dirname, '.env') });

/**
 * @see https://playwright.dev/docs/test-configuration
 * 
 */
// const RPconfig = {
//   apiKey: process.env.RP_API_KEY || 'reportal_V6nU_ewaTSqtxphURlNl_9p18q9OJ0XEucX7fgdfgQ5pqoxbXhmX47llwXssxU8d',
//   endpoint: 'https://demo.reportportal.io/api/v1',
//   project: 'preetish-collab_personal',
//   launch: 'Launch name',
//   description: 'E2E Regression Run',
//   attributes: [
//     { key: 'env', value: 'staging' },
//     { key: 'tool', value: 'playwright' }
//   ],
//   includeTestSteps: true, // Reports Playwright test.step() entries as nested steps
// };
module.exports = defineConfig({
  testDir: './tests',
  fullyParallel: false,
  forbidOnly: !!process.env.CI,
  workers: process.env.CI ? 2 : undefined,
  // reporter: process.env.CI ? 'blob' : 'html',
  //  reporter: [['list'], ['html'], ['junit', { outputFile: 'results.xml' }], ['json', { outputFile: 'resultsjson' }], ['allure-playwright', { outputFolder: 'allure-results' }]],
  // reporter: [['list'], ['html'],['monocart-reporter', { outputFile: 'monocart-results/index.html' }]],
    reporter: [['line'], ['html']],
    // reporter: [['line'], ['@reportportal/agent-js-playwright']], // Enable with proper RPconfig when needed
  use: {
    trace: 'retain-on-failure',
    screenshot: 'on-first-failure',
    video: 'off',
    storageState:'./auth.json'
  },
  
  projects: [
  
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] },
    },
    {
      name: 'firefox',
      use: { ...devices['Desktop Firefox'] },
    },
    {
      name: 'webkit',
      use: { ...devices['Desktop Safari'] },
    },
  ],
});

