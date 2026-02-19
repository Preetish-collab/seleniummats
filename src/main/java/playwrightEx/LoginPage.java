package playwrightEx;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private Locator usernamelocator;
    private Locator passwordlocator;
    private Locator submitbuttonlocator;
    public LoginPage(Page page) {
       usernamelocator= page.getByPlaceholder("Username");
       passwordlocator= page.getByPlaceholder("Password");
       submitbuttonlocator= page.locator("//button[@type='submit']");
    }
    public void enterUsername(String username){
        usernamelocator.fill(username);
    }
    public void enterPassword(String password){
        passwordlocator.fill(password);

}
       public void clickSubmit(){
        submitbuttonlocator.click();
    }
}
