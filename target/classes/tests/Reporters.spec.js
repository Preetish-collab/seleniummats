const { test, expect } = require('@playwright/test');
//npx playwright test tests/Reporters.spec.js --project chromium --headed
//allure generate allure-results -o allure-report --clean
//allure open allure-report

test('Test1', async ({ page }) => {
    await page.goto('https://www.demoblaze.com/index.html');
    await expect(page).toHaveTitle('STORE');
})

test('Test2', async ({ page }) => {
    await page.goto('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login');
    await expect(page).toHaveTitle('OrangeHRM1');
})


test('Test3', async ({ page }) => {
    await page.goto('https://www.redbus.in/');
    await expect(page).toHaveTitle('Bus Booking Online and Train Tickets at Lowest Price - redBus');
})



