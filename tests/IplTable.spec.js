const { test } = require('@playwright/test');
//npx playwright test tests/IplTable.spec.js --project chromium --headed
test('IPL Points Table', async ({ page }) => {

    await page.goto('https://www.cricbuzz.com/cricket-series/9241/indian-premier-league-2026/points-table');

    const teams = await page.locator("//*[@class='wb:p-3']//div[contains(@class,'grid point-table-grid p-2 ')]/descendant::div[contains(@class,'flex flex-row items-ce')]/span[1][position()=1]").allInnerTexts();
    const loose = await page.locator("//*[@class='wb:p-3']//div[contains(@class,'grid point-table-grid p-2 ')]/descendant::div[contains(@class,'flex flex-row items-ce')]/span[1]/following::div[contains(@class,'flex justify-start items-center')][position()=3]").allInnerTexts();

    for (let i = 0; i < teams.length; i++) {
        console.log(`Team: ${teams[i]} - Loose: ${loose[i]}`);
    }

    
});