package org.project;

public class StringTotalChar {
    public static void main(String[] args) {
        String s="Earth is beautiful";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
