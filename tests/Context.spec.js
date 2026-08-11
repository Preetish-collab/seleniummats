const { test, expect } = require('@playwright/test');
//ou need to test multi-user real-time interaction (e.g., User A sends a message, User B receives it).
test('Chat interaction between Admin and User', async ({ browser }) => {
  const adminContext = await browser.newContext({ storageState: 'auth.json' });
  const userContext = await browser.newContext({ storageState: 'userAuth.json' });

  const adminPage = await adminContext.newPage();
  const userPage = await userContext.newPage();

  await adminPage.goto('/dashboard');
  await userPage.goto('/dashboard');
})