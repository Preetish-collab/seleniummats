package org.project;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;


public class TestPW {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://www.google.com");
           System.out.println(page.title());
           page.type("input[name='q']","Playwright");
           page.click("//input[@name='btnK']");
           page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
           browser.close();
           playwright.close();

        }
    }

