package seleniumprac;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
    @Test
    @Parameters({"username","password","environment"})
    public void parameterTest(String username,String password,String environment) {
        System.out.println("environment is :"+environment);
        System.out.println("Parameterized value is : "+username);
        System.out.println("Parameterized value is : "+password);
    }
    @Test
    @Parameters({"username1","password1","environment"})
    public void parameterTest1(String username1,String password1,String environment) {
        System.out.println("Parameterized value is : "+username1);
        System.out.println("Parameterized value is : "+password1);
        System.out.println("Parameterized value is : "+environment);
    }
    //optional param
    @Test
    @Parameters({"adminuser"})
    public void parameterTest2(@Optional("defaultadmin")String adminuser) {
        System.out.println("Parameterized value is : "+adminuser);

    }
}
