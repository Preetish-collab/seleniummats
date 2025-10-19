package org.project;

public class Totalchar {
    public static void main(String[] args) {
        String str = "If you can smell what the rock is cooking";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ')
                count++;

            }
            System.out.println("Total number of characters in a string: " + count);
        }
    }
