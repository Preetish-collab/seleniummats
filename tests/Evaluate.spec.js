const{test,expect}=require('@playwright/test')
//npx playwright test tests/Evaluate.spec.js --project chromium --headed

test('EvaluateTest',async({page})=>{
 await page.goto("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");
 console.log((await page.locator('#persistent').boundingBox())?.height);
 console.log((await page.locator('#persistent').boundingBox())?.width);
 await page.evaluate("document.getElementById('persistent').click()");
 await page.waitForTimeout(5000);
});
test('EvaluateTest2',async({page})=>{
  await page.goto("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");  
 const pageDetails = await page.evaluate(() => {
  return {
    title: document.title,
    url: window.location.href,
    userAgent: navigator.userAgent
  };
});
console.log(pageDetails);
});
test('EvaluateTest3Highlight',async({page})=>{
  await page.goto("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");  
 await page.evaluate(() => {
  const username = document.querySelector('input[id="username"]');
  if (username) {
    username.style.border = '5px solid red';
    username.style.backgroundColor = 'green';
    
  }
});
 await page.waitForTimeout(5000);
});
test('EvaluateTestspecificelement',async({page})=>{
 await page.goto("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F");
 console.log((await page.locator('#persistent').boundingBox())?.height);
 console.log((await page.locator('#persistent').boundingBox())?.width);
 const checkbox = page.locator("#persistent");
 await checkbox.evaluate(el => el.click());
 

});
