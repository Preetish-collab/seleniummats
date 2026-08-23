const{test,expect}=require('@playwright/test');
//npx playwright test tests/TableHandle.spec.js --project chromium --headed
test('TableHandle',async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/');
   //1//find rows and cols
    const table=await page.locator('#productTable');//base table
    const cols=await table.locator('thead tr th');//fetching all columns
    console.log('Number of columns:',await cols.count());
    const rows=await table.locator('tbody tr');//fetching all rows
    console.log('Number of rows:',await rows.count());
    //  expect(await cols.count()).toBe(4);
    // expect(await rows.count()).toBe(5);
    
   //2 //applying filter on table for single match
    // const matchedRow=rows.filter({
    //     has: page.locator('td'),
    //     hasText: 'Smartwatch'
    // })
    // await matchedRow.locator('input').check()//clicking after match found

    //3//Select multiple products  match by using re-usable function
//     async function selectProduct(rows, page, name){
//     const matchedRow=rows.filter({
//     has: page.locator('td'),
//     hasText: name
//    }) 
//    await matchedRow.locator('input').check()
// }
//     await selectProduct(rows,page,'Laptop');
//     await selectProduct(rows,page,'Tablet');
//     await selectProduct(rows,page,'Smartphone');

//4//print all productdetails
for(let i = 0; i < await rows.count(); i++) 
   {
    const row = rows.nth(i);
    const tds = row.locator("td");
    for (let j = 0; j < await tds.count()-1; j++) 
        {
               console.log(await tds.nth(j).textContent());
          }
    }
    
});