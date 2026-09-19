const{test,expect}=require('@playwright/test');
//npx playwright test tests/Table4.spec.js --project chromium --headed
test('Table4',async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/p/playwrightpractice.html');
    const cols= await page.locator('//table[@name="BookTable"]//tr//th');
    const rows=await page.locator('//table[@name="BookTable"]//tbody//tr');
    const colCount=await cols.count();
    const rowCount=await rows.count();
    console.log("Total number of colums: ",colCount);
    console.log("Total number of rows: ",rowCount);
    for(let i=1;i<rowCount;i++){
        for(let j=0;j<colCount;j++){
            const cell=page.locator(`//table[@name="BookTable"]//tbody//tr[${i+1}]//td[${j+1}]`);
            console.log((await cell.textContent()).trim());
        }
    }
});