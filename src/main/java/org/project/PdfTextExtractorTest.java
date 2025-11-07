package org.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;



public class PdfTextExtractorTest {
    @Test
    public void extractPdfTextFromPage() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open the page that contains a link to the PDF.
            // Replace with your actual page URL
            driver.get("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");

            // If the page itself is a PDF, use the current URL.
            // Otherwise find an anchor linking to a .pdf file:
            WebElement pdfLink = null;
            try {
                pdfLink = driver.findElement(By.cssSelector("a[href$='.pdf']"));
            } catch (Exception ignored) {
                // no anchor found; treat current URL as PDF
            }

            String pdfUrl = (pdfLink != null) ? pdfLink.getAttribute("href") : driver.getCurrentUrl();

            // Download PDF bytes via HTTP
            URL url = new URL(pdfUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            conn.connect();

            try (InputStream in = conn.getInputStream();
                 PDDocument document = PDDocument.load(in)) {

                String text = new PDFTextStripper().getText(document).trim();
                System.out.println("Extracted PDF text (first 300 chars):");
                System.out.println(text.length() > 300 ? text.substring(0, 300) + "..." : text);

                // Basic assertion: ensure we extracted some text
                Assert.assertFalse(text.isEmpty(), "PDF text should not be empty");
            } finally {
                conn.disconnect();
            }
        } finally {
            driver.quit();
        }
    }

}
