package org.project;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String str="Dont Hurry Definitely you are going to crack this interview";
        int vCount=0;
        int cCount=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
    vCount++;
    
}
else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
    cCount++;
    
}
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
