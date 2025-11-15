package org.project;

public class CopyElementsArray {
    public static void main(String[] args) {
        int array1[] = {10, 20, 30, 40, 50};
        int array2[]=new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        //Displaying elements of array array1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        //Displaying elements of array array2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
