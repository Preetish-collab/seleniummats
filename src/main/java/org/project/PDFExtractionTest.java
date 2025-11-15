package org.project;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class PDFExtractionTest {
    public static WebDriver driver;
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.antennahouse.com/hubfs/xsl-fo-sample/pdf/basic-link-1.pdf");
    }

    @Test
    public void readpdfinsameBrowser() throws Exception {
        String url= driver.getCurrentUrl();
        URL pdfURL = new URL(url);
        System.out.println("PDF URL after clicking the link: " + pdfURL);
        URLConnection urlConnection= pdfURL.openConnection();
        urlConnection.addRequestProperty("user-agent", "Chrome");
        InputStream ip=urlConnection.getInputStream();
        BufferedInputStream bf=new BufferedInputStream(ip);
        //using PDFBox library to read PDF content
       PDDocument pdDocument= PDDocument.load(bf);
     int pageCount=  pdDocument.getNumberOfPages();
     System.out.println("Total number of pages in the PDF: "+pageCount);
        Assert.assertEquals(pageCount,2,"Page count match");
        System.out.println(pdDocument.getVersion());
        System.out.println(pdDocument.getCurrentAccessPermission().canPrint());
        System.out.println(pdDocument.getCurrentAccessPermission().isReadOnly());
        System.out.println(pdDocument.getCurrentAccessPermission().isOwnerPermission());

        System.out.println(pdDocument.getDocumentInformation().getCreator());
        System.out.println(pdDocument.getDocumentInformation().getSubject());

        //Read Full Pdf
        PDFTextStripper pdfTextStripper=new PDFTextStripper();
        String pdfContent= pdfTextStripper.getText(pdDocument);
        System.out.println("PDF Content:"+pdfContent);
        Assert.assertTrue(pdfContent.contains("Its destination may be either an external file or a website."),"Text is present in PDF");
            }




    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
