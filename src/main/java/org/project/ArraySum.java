package org.project;

public class ArraySum {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = {5, 1, 7, 3, 6};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
