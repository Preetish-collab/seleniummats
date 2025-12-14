package org.project;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayDuplicatesRemoval {
    public static void main(String[] args) {
        int arr[]={10,20,30,4,10,20};
        HashSet<Integer> set=new HashSet<>();
        System.out.println("Duplicates found::");
        for(int value :arr){
           if(!set.add(value)){;
              System.out.println(value);
           }
        }


    }
}
