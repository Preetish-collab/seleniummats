const { test, expect } = require('@playwright/test');
const fs = require('fs');

// npx playwright test tests/Parameterisewithjson.spec.js --project chromium --headed
// testdata
const jsonPath="./tests/testdata/data.json";
const loginData=JSON.parse(fs.readFileSync(jsonPath,'utf-8'));

for (const data of loginData) {
    const { email, password, validity } = data;
    test(`Login test for ${email} and ${password}`, async ({ page }) => {
        await page.goto('https://demowebshop.tricentis.com/login');
        // Fill login form
        await page.locator('#Email').fill(email);
        await page.locator('#Password').fill(password);
        await page.locator("input[value='Log in']").click();

        if (validity.toLowerCase() === 'valid') {
            const logoutLink = page.locator('a[href="/logout"]');
            await expect(logoutLink).toBeVisible({ timeout: 5000 });
        } 
        else {
            const errorMessage = page.locator('.validation-summary-errors');
            await expect(errorMessage).toBeVisible({ timeout: 5000 });
        }
    });
}


