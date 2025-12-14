package org.project;

import java.util.Arrays;

public class ArraySortEx2 {
    public static void main(String[] args) {
        int a[]=new int[]{10,4,2,43,8,1};
        System.out.println("Array elements in ascending order:");
        for(int i=0;i<a.length;i++){
            Arrays.sort(a);
            System.out.println(a[i]);

            }
        System.out.println("Array elements in descending order:");
        for(int i=a.length-1;i>=0;i--){
            Arrays.sort(a);
            System.out.println(a[i]);
        }

    }
    }
