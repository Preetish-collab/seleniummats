package seleniumprac;

import org.testng.annotations.Test;

public class TestNGDependencyEx {
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void SignIn() {
        System.out.println("This will execute second (SignIn)");
    }

    @Test
    public void OpenBrowser() {
        System.out.println("This will execute first (Open Browser)");
    }
    @Test(groups = { "viewacc" })
    public void ViewAcc() {
        System.out.println("View Your Dashboardd");
    }

    @Test(groups = { "login" })
    public void LogIn() {
        System.out.println("Login Into The Account");
    }

    @Test(groups = {"logout"})
    public void CloseAccount() {
        System.out.println("Closing The Account");
    }
}
