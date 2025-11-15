package org.project;

public class OccurenceofCharacter {
    public static void main(String[] args) {
        String s="accenture";
        char c;
        int count=0;
        for(int i=0;i<s.length();i++) {
            c=s.charAt(i);
            if(c=='e'){
                count++;
            }
        }
        System.out.println("The character 'e' appears "+count+" times in the string.");
    }
}
