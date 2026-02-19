package org.project;

import java.util.HashMap;

public class Frequencyofeachchar {
    public static void main(String[] args) {
        String str="hello world today is my day";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
      System.out.println(map);
    }
}
