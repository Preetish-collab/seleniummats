class OrangeHrm{
    constructor(page){
        this.page=page;
        this.username=page.getByPlaceholder("Username");
        this.password=page.getByPlaceholder("Password");
        this.loginButton=page.getByRole('button',{type:'submit'});
        this.logoutdropDown=page.locator("//span[@class='oxd-userdropdown-tab']//following::i[contains(@class,'oxd-icon bi-caret')]");
        this.logoutButton=page.locator("//a[text()='Logout']");
    }

    async launchURL(url){
        await this.page.goto(url);
    }
    async enterUsername(username){
        await this.username.fill(username);
    }
     async enterPassword(password){
        await this.password.fill(password);
    }
     async clickloginButton(){
        await this.loginButton.click();
     }

     async clicklogoutdropDown(){
        await this.logoutdropDown.waitFor({ state: 'visible', timeout: 4000 });
        await this.logoutdropDown.click();
    }
    async clicklogoutButton(){
        await this.logoutButton.waitFor({ state: 'visible', timeout: 4000 });
        await this.logoutButton.click();
    }
}
module.exports ={
    OrangeHrm
}