package org.project;

public class StartsWith {
    public static void main(String[] args) {
        String s1 = "Jackfruit is very good for healtH";
        String s2 = s1.toLowerCase();
        System.out.println(s2.startsWith("jackfruit"));

        System.out.println(s2.endsWith("health"));
    }
}