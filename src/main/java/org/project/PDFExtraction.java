package org.project;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFExtraction {
    public static void main(String[] args) throws Exception {
        // example usage (uncomment and adapt the path)
         String text = extractText(Paths.get("C:\\Users\\Preetish\\IdeaProjects\\Bangalore_Testing\\src\\main\\resources\\SarojResume.pdf"));
         System.out.println(text);
    }

    public static String extractText(Path pdfPath) throws IOException {
        try (PDDocument document = PDDocument.load(pdfPath.toFile())) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
    public static String extractText(InputStream inputStream) throws IOException {
        try (PDDocument document = PDDocument.load(inputStream)) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
}



