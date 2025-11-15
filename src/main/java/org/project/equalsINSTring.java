package org.project;

public class equalsINSTring {
    public static void main(String[] args) {
        String s1 = "preetish";
        String s2 = "nikhil";
        String s3 = "Preetish";
        String s4 = "preetish";
        System.out.println(s1 == s2);//different names
        System.out.println(s1 == s3);//case mismatch
        System.out.println(s1 == s4); //matched

        System.out.println(s1.equals(s2));//different names
        System.out.println(s1.equals(s3));//case mismatch
        System.out.println(s1.equals(s4)); //matched

        System.out.println(s1.equals(s2));//different names
        System.out.println(s1.equalsIgnoreCase(s3));//case match
        System.out.println(s1.equals(s4)); //matched
    }
}