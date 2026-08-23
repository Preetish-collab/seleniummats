import {test,expect} from '@playwright/test'
//npx playwright test Test1.spec.ts  --headed --workers=3  -parallel execution
test('Demoblaze',async({page})=>{
    const run=5;
    for(let i=0;i<run;i++){
    await page.goto('https://www.demoblaze.com');
    const pageTitle=await page.title();
    console.log(pageTitle);
    expect(pageTitle).toBe('STORE');
    await page.getByRole('link',{name:'Log in'}).click();
    await page.locator('input#loginusername').fill('pavalol');
    await page.locator('input#loginpassword').fill('test@123');
    await page.getByRole('button',{name:'Log in'}).click();
    await expect(page.locator("//a[contains(text(),'Welcome')]")).toBeTruthy();
    }
}) 