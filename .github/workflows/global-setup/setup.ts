import { chromium } from '@playwright/test'

async function globalSetup()
{
    const browser = await chromium.launch();

    const context = await browser.newContext({
          httpCredentials : {
        username : 'admin',
        password : 'admin'
    }
    });
  
    const page = await context.newPage();
    await page.goto("https://the-internet.herokuapp.com/basic_auth")
    console.log("Basic Authentication Completed")
await context.storageState({path : 'auth.json'});
await browser.close();
}

export default globalSetup;