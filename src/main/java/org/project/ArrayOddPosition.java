package org.project;

public class ArrayOddPosition {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=12;
        a[1]=2;
        a[2]=4;
        a[3]=5;
        a[4]=6;
        a[5]=15;
        System.out.println("Arrays Present in odd position::");
        for(int i=1;i<a.length;i+=2){

            System.out.println(a[i]);
    }
}}
