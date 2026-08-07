const { test, expect } = require('@playwright/test');
//npx playwright test tests/Alerts.spec.js --project chromium --headed
test('Alerts', async ({ page }) => {
  await page.goto('https://testautomationpractice.blogspot.com/');

  // Enable alert handling
  //page.on('dialog', async dialog => await dialog.accept());
  page.on('dialog', async dialog => {
    // Verify type of dialog
    // expect(dialog.type()).toContain('alert');   
    
    // verify message of alert
    //expect(dialog.message()).toContain('I am an alert box!');
    
    //click on alert ok button
    await dialog.accept();
  });
 
  // Click on Trigger an alert button
   await page.click('//button[normalize-space()="Simple Alert"]');
});



test('Confirm Alert with OK and Cancel', async ({ page }) => {
    await page.goto('https://testautomationpractice.blogspot.com/');
  
    // Enable alert handling
  //  page.on('dialog', async dialog => await dialog.dismiss());
    page.on('dialog', async dialog => {
      // Verify type of dialog
       expect(dialog.type()).toContain('confirm');   
      
      // verify message of alert
      expect(dialog.message()).toContain('Press a button!');
      
      //click on alert ok button
      //await dialog.dismiss();
      await dialog.accept();
    });
     // Click on Trigger an alert button
     await page.click('//button[normalize-space()="Confirmation Alert"]');

    // Verify message displayed after clicking on OK button
   // await expect(page.locator('//p[@id="demo"]')).toHaveText('You pressed OK!')

  });
  


test('Prompt Alert', async ({ page }) => {
    await page.goto('https://testautomationpractice.blogspot.com/');
  
    // Enable alert handling

    page.on('dialog', async dialog => {
      // Verify type of dialog
       expect(dialog.type()).toContain('prompt');   
      
      // verify message of alert
      expect(dialog.message()).toContain('Please enter your name:');
      
      //Verify Default Input Value
      expect(dialog.defaultValue()).toContain('Harry Potter');

      // Click on OK Button with any value
      await dialog.accept('John');
    });
     // Click on Trigger an alert button
     await page.click('//button[normalize-space()="Prompt Alert"]');

    // Verify message displayed after clicking on OK button
    await expect(page.locator('//p[@id="demo"]')).toHaveText('Hello John! How are you today?')

  });
  