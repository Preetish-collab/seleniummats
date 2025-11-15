package org.project;

public class UseOfToLower {
    public static void main(String[] args) {
        String s = "JackfRuitBowl";
        String s2 = s.toLowerCase();
        String s3=s2.replaceAll("[aeiou]", "x");
        System.out.println(s3);
    }
}