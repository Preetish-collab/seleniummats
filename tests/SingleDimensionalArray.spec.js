const{test,expect}=require('@playwright/test');
//npx playwright test tests/SingleDimensionalArray.spec.js --project chromium --headed
//testdata
const searchItems = ['$25 Virtual Gift Card','camera','smartphone'];
for(const item of searchItems)
{
test(`search testlogin test ${item}`,async({page})=>{
await page.goto('https://demowebshop.tricentis.com/');
await page.locator('#small-searchterms').fill(item);
await page.locator("input[value='Search store']").click();

});
}