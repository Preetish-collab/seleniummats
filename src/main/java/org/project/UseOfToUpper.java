package org.project;

public class UseOfToUpper {
    public static void main(String[] args) {
        String s = "JackfRuitBowl";
        String s2 = s.toUpperCase();
       String s3= s2.replaceAll("[AEIOU]", "@");
        System.out.println(s3);
    }
}
