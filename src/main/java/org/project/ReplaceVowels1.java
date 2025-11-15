package org.project;

public class ReplaceVowels1 {
    public static void main(String[] args) {
        String s = "jackfruitbowl";
        String s2 = s.replaceAll("[aeiou]", "x");
        System.out.println(s2);
    }
}