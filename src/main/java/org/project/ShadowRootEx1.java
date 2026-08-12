package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ShadowRootEx1 {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://shop.polymer-project.org/");
        //copy js path from dev console and paste it in console and get the element and click on it to verify
        //note-remove double quotes from the js path and replace it with single quotes and add return in the start of the js path
        //return is important to get the element from the js path
        String str="return document.querySelector('body > shop-app').shadowRoot.querySelector('iron-pages > shop-home').shadowRoot.querySelector('div:nth-child(2) > shop-button > a')";
        WebElement shpbtn= (WebElement) ((JavascriptExecutor) driver).executeScript(str);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement shpbtn = (WebElement) js.executeScript(str);
        shpbtn.click();

    }
}