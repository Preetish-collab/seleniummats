package org.project;

public class DuplicatesinArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,2,4,};
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    System.out.println("Duplicate element found: " + arr1[i]);
                    break;
                }
            }
        }
    }
}
