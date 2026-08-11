const{test,expect}=require('@playwright/test')
//npx playwright test tests/FramesHandle.spec.js --project chromium --headed
test('Frames',async({page})=>{
    await page.goto('https://demo.automationtesting.in/Frames.html');
    //single frame
    const iframe = page.frameLocator('iframe[name="SingleFrame"]');
    await iframe.getByRole('textbox').fill('preetish');
    //nested frame
    await page.locator("//a[text()='Iframe with in an Iframe']").click();
    const outerFrame = page.frameLocator('iframe[src="MultipleFrames.html"]');
    const innerFrame = outerFrame.frameLocator('iframe[src="SingleFrame.html"]');
    await innerFrame.getByRole('textbox').fill('selenium');
    
})