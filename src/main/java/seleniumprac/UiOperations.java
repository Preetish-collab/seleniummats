package seleniumprac;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UiOperations {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;
    private static final int DEFAULT_TIMEOUT = 10;

    public UiOperations(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        this.actions = new Actions(driver);
    }

    // ==========================================
    // 1. WAITS & ELEMENT LOCATING
    // ==========================================

    /**
     * Waits for element to be visible on the DOM and page.
     */
    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Waits for element to be clickable (visible and enabled).
     */
    public WebElement waitForClickability(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // ==========================================
    // 2. BASIC INTERACTION METHODS
    // ==========================================

    /**
     * Safely clicks an element after waiting for clickability.
     */
    public void click(By locator) {
        try {
            waitForClickability(locator).click();
        } catch (ElementClickInterceptedException e) {
            // Fallback to JavaScript click if intercepted by overlay
            clickViaJS(locator);
        }
    }

    /**
     * Clears existing text and types the given text into an input field.
     */
    public void type(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Retrieves text from a web element.
     */
    public String getText(By locator) {
        return waitForVisibility(locator).getText().trim();
    }

    /**
     * Checks whether an element is present and displayed without throwing an exception.
     */
    public boolean isElementDisplayed(By locator) {
        try {
            return waitForVisibility(locator).isDisplayed();
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
    }

    // ==========================================
    // 3. DROPDOWNS & SELECTS
    // ==========================================

    /**
     * Selects a option from a standard HTML <select> dropdown by visible text.
     */
    public void selectByVisibleText(By locator, String text) {
        WebElement element = waitForVisibility(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    /**
     * Selects an option from a standard HTML <select> dropdown by value.
     */
    public void selectByValue(By locator, String value) {
        WebElement element = waitForVisibility(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    // ==========================================
    // 4. MOUSE & KEYBOARD ACTIONS
    // ==========================================

    /**
     * Hovers over an element.
     */
    public void hoverOverElement(By locator) {
        WebElement element = waitForVisibility(locator);
        actions.moveToElement(element).perform();
    }

    /**
     * Double clicks an element.
     */
    public void doubleClick(By locator) {
        WebElement element = waitForClickability(locator);
        actions.doubleClick(element).perform();
    }

    /**
     * Performs a Drag and Drop action.
     */
    public void dragAndDrop(By source, By target) {
        WebElement sourceElem = waitForVisibility(source);
        WebElement targetElem = waitForVisibility(target);
        actions.dragAndDrop(sourceElem, targetElem).perform();
    }

    // ==========================================
    // 5. JAVASCRIPT EXECUTOR HELPERS
    // ==========================================

    /**
     * Force clicks an element using JavaScript (useful for stubborn overlays).
     */
    public void clickViaJS(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    /**
     * Scrolls the page until the specified element is in view.
     */
    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // ==========================================
    // 6. FRAMES & WINDOW HANDLES
    // ==========================================

    /**
     * Switches context to an iframe by locator.
     */
    public void switchToFrame(By frameLocator) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }

    /**
     * Switches back to the default window context from an iframe.
     */
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    /**
     * Switches to a newly opened tab/window.
     */
    public void switchToNewTab() {
        String currentWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
