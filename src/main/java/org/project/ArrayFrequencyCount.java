package org.project;

public class ArrayFrequencyCount {
    public static void main(String[] args) {
        int a[]=new int[]{12,2,4,2,6,2};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
        }
        System.out.println("Frequency of the arrray elements is: "+count);
    }
}
