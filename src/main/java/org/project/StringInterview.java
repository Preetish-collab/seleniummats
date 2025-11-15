package org.project;

import java.util.HashSet;

public class StringInterview {

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "grapes";
        HashSet<Character> s = new HashSet<>();
        for (char c : s1.toCharArray()) {
            s.add(c);
        }

        for (char c : s2.toCharArray() ) {
            if (s.contains(c)) {
                System.out.println("Common character: " + c);
            }
        }
    }
}
