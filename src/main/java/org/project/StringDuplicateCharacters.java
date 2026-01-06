package org.project;

import java.util.Locale;

public class StringDuplicateCharacters {
    public static void main(String[] args) {
        int count=0;
        String s="Great Responsibility";
        String s2=s.toLowerCase();
        char[]ch=s2.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]&& ch[i]!=' '){
                    System.out.println(ch[j]);
                    count++;
                    break;
                }
            }
        }

    }
}
