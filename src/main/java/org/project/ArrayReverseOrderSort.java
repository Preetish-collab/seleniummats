package org.project;

public class ArrayReverseOrderSort {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=34;
        a[1]=12;
        a[2]=5;
        a[3]=67;
        a[4]=23;
        a[5]=89;
        System.out.println("Array elements in preserve order:");
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        // Sorting array in reverse order
        System.out.println("Array elements in reverse order:");
        for(int i=a.length-1;i>=0;i--){
            System.out.println();
            System.out.print(a[i]);
        }


    }
}
