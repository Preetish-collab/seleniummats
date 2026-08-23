import { Page} from "@playwright/test";
import { BasePage} from "./BasePage";
export class Products extends BasePage
{
    constructor(page:Page)
    {
      super(page);
    }
    private productText=".title";
    private logo=".app_logo";
    private productList=".inventory_item";
    private productTitle=".inventory_item_name";
    private productDescription=".inventory_item_desc";
    private productPrice=".inventory_item_price";
    private addToCart=".btn_primary.btn_small.btn_inventory";
    private checkOutButton=".shopping_cart_link";

    async clickOnCheckOutButton()
    {
        await this.page.locator(this.checkOutButton).click();
    }

   async addtoCartByName(targetProductName:string)
   {
  const productNameCount=await this.page.locator(this.productList).count();
   console.log(productNameCount);
   for(let i=0;i<productNameCount;i++)
   {
    const product=this.page.locator(this.productList).nth(i);
    const name= await product.locator(this.productTitle).textContent();
    console.log(name);
    if(name?.trim()===targetProductName)
    {
      await product.locator(this.addToCart).click();
      console.log(`product ${targetProductName} is added to Cart`);
      return;
    }
   }
   throw new Error(`product ${targetProductName} is not found on page`);
   }

   async isProductFieldVisible(): Promise <boolean>
   {
     return await this.page.locator(this.productText).isVisible();

   }
     async isLogoPresent(): Promise <boolean>
   {
     return await this.page.locator(this.logo).isVisible();
     
   }
   async validateProductDetails()
   {
    const product= await this.page.locator(this.productList).count();
    console.log(`Total products found : ${product}`);

    for(let i=0;i<product;i++)
    {
       const title= await this.page.locator(this.productList).nth(i).locator(this.productTitle).innerText();
       console.log(`product ${i+1} Title: ${title}`);
        
       if(!title)

    {
        throw new Error(`product ${i+1} is missing a title`);
    }
     const description= await this.page.locator(this.productList).nth(i).locator(this.productDescription).innerText();
       console.log(`product ${i+1} Description: ${description}`);
        
       if(!description)

    {
        throw new Error(`product ${i+1} is missing a description`);
    }
     const price= await this.page.locator(this.productList).nth(i).locator(this.productPrice).innerText();
       console.log(`product ${i+1} Price: ${price}`);
        
       if(!price)

    {
        throw new Error(`product ${i+1} is missing a price`);
    }

    const addToCart= await this.page.locator(this.productList).nth(i).locator(this.addToCart).innerText();
       console.log(`product ${i+1} addToCart: ${addToCart}`);
        
       if(!addToCart)

    {
        throw new Error(`product ${i+1} is missing a addToCart`);
    }
    }
   }
}