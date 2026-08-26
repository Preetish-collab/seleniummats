import { test } from '@playwright/test';
import runAgent from '../ai/agent';
// npx playwright test tests/aitest.spec.ts --project=chromium --headed
test('AI Playwright Agent Test', async ({ page }) => {
  const task = "Open google.com, search Playwright, click the first link and take a screenshot";

  await runAgent(page, task);
});