package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHrmLogin {
    public static WebDriver driver;

    @Given("I am on the Orange HRM login page")
    public void i_am_on_the_orange_hrm_login_page() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000); // Wait for 5 seconds to ensure the page loads completely
        String title = driver.getTitle();
        System.out.println(title);


    }


        @When("I enter valid {string} and {string}")
        public void iEnterValidAnd(String username, String password){
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        }



    @And("I click on the login button")
    public void i_click_on_the_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);

    }
    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
      driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
      String title= driver.getTitle();
      System.out.println(title);
      driver.close();
    }


    @Then("I should not be redirected to the dashboard page")
    public void iShouldNotBeRedirectedToTheDashboardPage() {
     WebElement text=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        if (text.isDisplayed()){
            System.out.println("Invalid credentials message is displayed");
        } else {
            System.out.println("Invalid credentials message is not displayed");
        }
    }
}
