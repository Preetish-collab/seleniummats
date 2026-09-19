const{test,expect}=require('@playwright/test');
//npx playwright test tests/Table3.spec.js --project chromium --headed
test('Table3',async({page})=>{
    await page.goto('https://testautomationpractice.blogspot.com/p/playwrightpractice.html');
    const cols= await page.locator('//table[@name="BookTable"]//tr//th');
    const rows=await page.locator('//table[@name="BookTable"]//tbody//tr');
    const colCount=await cols.count();
    const rowCount=await rows.count();
    console.log("Total number of colums: ",colCount);
    console.log("Total number of rows: ",rowCount);
    const headers=(await cols.allTextContents()).map(header=>header.trim());
    const tableData=[];
    for(let i=1;i<rowCount;i++){
        const rowValues=[];
        for(let j=0;j<colCount;j++){
            const cell=page.locator(`//table[@name="BookTable"]//tbody//tr[${i+1}]//td[${j+1}]`);
            rowValues.push((await cell.textContent()).trim());
        }
        tableData.push(rowValues);
    }

    const columnWidths=headers.map((header,index)=>Math.max(
        header.length,
        ...tableData.map(row=>row[index].length)
    ));
    const formatRow=row=>`| ${row.map((value,index)=>value.padEnd(columnWidths[index])).join(" | ")} |`;
    const divider=`+-${columnWidths.map(width=>"-".repeat(width)).join("-+-")}-+`;

    console.log(divider);
    console.log(formatRow(headers));
    console.log(divider);
    tableData.forEach(row=>console.log(formatRow(row)));
    console.log(divider);


});
