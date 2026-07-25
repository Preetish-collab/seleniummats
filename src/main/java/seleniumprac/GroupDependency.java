package seleniumprac;

import org.testng.annotations.Test;

public class GroupDependency extends TestNGDependencyEx {
    @Test(dependsOnGroups = { "SignIn" })
    public void ViewAcc() {
        System.out.println("SignIn Successful");
    }
    @Test(groups = { "SignIn" })
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }

    @Test(groups = { "SignIn" })
    public void LogIn() {
        System.out.println("Logging In Success");
    }
}
