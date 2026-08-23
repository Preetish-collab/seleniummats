import{test,expect} from '@playwright/test';
import { Login} from './SauceDemoPage/LoginPage';
import { Products } from './SauceDemoPage/Product';
import { CheckOutPage } from './SauceDemoPage/CheckOutPage';
//npx playwright test LoginToSauceDemo.spec.ts --project=chromium --headed

test("User should be able to login",async({page})=>{

    const login= new Login(page);
    const product=new Products(page);
    const cart=new CheckOutPage(page);
    await login.navigate("https://www.saucedemo.com/");
    await login.waitForPageLoad();
    await login.logintoSauceDemo("standard_user","secret_sauce");
    await expect(page).toHaveURL("https://www.saucedemo.com/inventory.html");
    await expect(page).toHaveTitle("Swag Labs");

    const isProduct=await product.isProductFieldVisible();
    expect(isProduct).toBeTruthy();

    const logo=await product.isLogoPresent();
    expect(logo).toBeTruthy();

    await product.validateProductDetails();
    await product.addtoCartByName("Sauce Labs Backpack");
    await page.waitForTimeout(3000);
    await product.clickOnCheckOutButton();
    const productName= await cart.getProductNameInCart();
    expect(productName).toBe("Sauce Labs Backpack")

})