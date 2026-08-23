import { Page} from "@playwright/test";
import { BasePage} from "./BasePage";
export class Login extends BasePage
{
constructor(page:Page)
{
    super(page);
}

private userNameField="#user-name";
private passwordField="#password";
private loginButton="#login-button";

async logintoSauceDemo(username : string, password : string)
{
await this.page.fill(this.userNameField,username);
await this.page.fill(this.passwordField,password);
await this.page.click(this.loginButton);
}

}