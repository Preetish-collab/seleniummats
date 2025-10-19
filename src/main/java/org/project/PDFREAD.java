package org.project;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class PDFREAD {
    public static void main(String[] args) throws IOException {
        File pdffile=new File("C:\\Users\\Preetish\\OneDrive\\Desktop\\PreetishKumarBhanjadeoResume.pdf");
        PDDocument document=PDDocument.load(pdffile);
        PDFTextStripper pdfstripper=new PDFTextStripper();
        String text= pdfstripper.getText(document);
        document.close();
        System.out.println(text);
        Assert.assertTrue(text.contains("Senior Test Engineer"));
        System.out.println("Text found in PDF file");
    }
}
