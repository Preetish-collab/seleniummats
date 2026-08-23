import { test, expect, Page } from '@playwright/test';
//npx playwright test Functionreuse.spec.ts  --headed --workers=3  -parallel execution
async function login(page:Page){
      await page.goto('https://www.demoblaze.com');
    const pageTitle=await page.title();
    console.log(pageTitle);
    expect(pageTitle).toBe('STORE');
    await page.getByRole('link',{name:'Log in'}).click();
    await page.locator('input#loginusername').fill('pavalol');
    await page.locator('input#loginpassword').fill('test@123');
    await page.getByRole('button',{name:'Log in'}).click();
}
test.describe('usingfunction', async () => {
  test('check phones',async({page})=>{
    await login(page);
   await page.locator("//a[text()='Phones']").click();
  const phones=await page.locator("//h4[@class='card-title']/a").all();
  for(const phone of phones ){
    const phonemodel= await phone.textContent();
    console.log("Models are::: ",phonemodel);
  }
})
    test('check laptops',async({page})=>{
        await login(page);
   await page.locator("//a[text()='Laptops']").click();
  const Laptops=await page.locator("//h4[@class='card-title']/a").all();
  for(const Laptop of Laptops ){
    const Laptopmodel= await Laptop.textContent();
    console.log("Models are::: ",Laptopmodel);
  }
    })
});