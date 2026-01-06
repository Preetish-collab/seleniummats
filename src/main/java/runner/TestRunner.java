package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = "C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\java\\featurefiles",
            glue = {"stepDefinition", "myHooks"},
            tags = "@Smoke or @Regression",
           plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
            monochrome = true
    )
    public class TestRunner {
}
