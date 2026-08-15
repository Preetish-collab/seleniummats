//const{test,expect}=require('@playwright/test');
import {test, expect} from '@playwright/test';
test('Locators',async({page})=>{
    await page.goto('https://www.demoblaze.com/');
    //await page.locator('id=login2').click();
    //await page.locator('#login2').click();
    //await.click('id=login2');
    await page.click('id=signin2')
    //await page.locator('#sign-username').fill('preetish');
    await page.fill('#sign-username','preetish');
    await page.fill("input[id='sign-password']",'preetish123');


    })