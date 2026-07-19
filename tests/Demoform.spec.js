//test and expect are imported from playwright/test
//page is a fixture provided by playwright/test that represents to access web page and perform actions on it
//async function is used to handle asynchronous operations in the test
//await is used to wait for the completion of asynchronous operations before proceeding to the next line of code
//const is used to declare a variable that is not changing its value throughout the test
//npx playwright test tests/Demoform.spec.js --project chromium --headed
const{test,expect}=require('playwright/test')
test('Demoform',async({page})=>{
await page.goto('https://demo.automationtesting.in/Register.html');
const pageTitle=page.title();
console.log('page Title:',pageTitle);
//Assertions
await expect(page).toHaveTitle('Register');
await expect(page).toHaveURL('https://demo.automationtesting.in/Register.html');
//input box operations 
await expect(await page.locator("//input[@placeholder='First Name']")).toBeVisible();
await expect(await page.locator("//input[@placeholder='First Name']")).toBeEnabled();
await expect(await page.locator("//input[@placeholder='First Name']")).toBeEmpty();
await expect(await page.locator("//input[@placeholder='First Name']")).toBeEditable();
await page.locator("//input[@placeholder='First Name']").fill('Preetish');
await page.waitForTimeout(5000);
await expect(await page.locator("//input[@placeholder='Last Name']")).toBeVisible();
await expect(await page.locator("//input[@placeholder='Last Name']")).toBeEnabled();
await expect(await page.locator("//input[@placeholder='Last Name']")).toBeEmpty();
await expect(await page.locator("//input[@placeholder='Last Name']")).toBeEditable();
await page.fill("//input[@placeholder='Last Name']",'Bhanjadeo');

await page.locator("//textarea[@ng-model='Adress']").fill('Bangalore');

await page.locator("input[type='email']").fill('Bhanjadeo@gmail.com');
await page.locator("input[type='tel']").fill('1234567890');
await page.waitForTimeout(5000);
//radio button operations
await page.locator("//input[@value='Male']").check();
await expect (await page.locator("input[value='Male']")).toBeChecked();
await expect(await page.locator("input[value='Male']").isChecked()).toBeTruthy();
await expect(await page.locator("input[value='Male']").isChecked()).toBe(true);
await expect(await page.locator("input[value='FeMale']").isChecked()).toBeFalsy();
 
//singlecheckbox
//await page.locator("//input[@id='checkbox1' and @type='checkbox']").check();

//multiple checkboxes
const checkboxes=[
    "//input[@id='checkbox1' and @type='checkbox']",
    "//input[@id='checkbox2' and @type='checkbox']",
    "//input[@id='checkbox3' and @type='checkbox']"
];
for(const checkbox of checkboxes){
    await page.locator(checkbox).check();
}   
//fetching multiple elements of links
const links=await page.$$('a');
for(const link of links){
    const linkText=await link.textContent();
    console.log('link text:',linkText);

    //dropdown operations
    // await page.locator("//div[@id='msdd']").click();
    // const dropdownOptions=await page.$$("//ul/li/a[@class='ui-corner-all']");
    // for (let optionHandle of dropdownOptions) {
    //    let text = await optionHandle.textContent();
    //  //  console.log(text);
    //  if(text.includes('English')) {
    //     await optionHandle.click();
    //     break;
    //   }
    // }
    // await page.waitForTimeout(10000);

    
}

})