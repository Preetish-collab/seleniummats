package seleniumprac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class LoggingListner  implements WebDriverListener {
    public static WebDriver driver;
    @Override
    public void beforeClick(WebElement element) {
        System.out.println("About to click on: " + element.getAccessibleName());
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("Successfully clicked on element.");
    }

    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        System.out.println("Searching for element: " + locator);
    }

    public void onError(Object target, java.lang.reflect.Method method, Object[] args, Exception e) {
        System.err.println("An error occurred during call to " + method.getName() + ": " + e.getMessage());
        // You could trigger a screenshot utility here!
    }}


