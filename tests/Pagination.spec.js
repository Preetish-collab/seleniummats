const { test } = require('@playwright/test');

// npx playwright test tests/Pagination.spec.js --project chromium --headed
test('paginate', async ({ page }) => {
  await page.goto(
    'https://testautomationpractice.blogspot.com/p/playwrightpractice.html',
    { waitUntil: 'domcontentloaded' }
  );

  while (true) {
    const items = page.locator('.column-center-inner');
    const itemCount = await items.count();

    for (let index = 0; index < itemCount; index++) {
      console.log(await items.nth(index).innerText());
    }

    const paginationLinks = page.locator('#pagination a');
    const activePage = Number(
      await page.locator('#pagination a.active').innerText().catch(() => '')
    );
    const nextPage = activePage + 1;
    const nextButton = paginationLinks.filter({ hasText: String(nextPage) });

    // Stop when there is no numeric page after the active page.
    if (!Number.isInteger(activePage) || (await nextButton.count()) === 0) {
      break;
    }

    await nextButton.click();
    await page.locator('#pagination a.active').waitFor({
      state: 'visible',
    });
  }
});