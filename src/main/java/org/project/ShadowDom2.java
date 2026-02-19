package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ShadowDom2 {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://dev.automationtesting.in/shadow-dom");
        String str="return document.querySelector('#shadow-root').shadowRoot.querySelector('#inner-shadow-dom').shadowRoot.querySelector('#nested-shadow-dom').shadowRoot.querySelector('#multi-nested-shadow-element')";
        String text= (String) ((JavascriptExecutor) driver).executeScript(str+".textContent");
        System.out.println(text);
    }
}
