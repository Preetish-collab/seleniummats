package org.project;

public class ArrayLeftRotate {
    public static void main(String[] args) {
        int a[] = new int[6];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        a[5] = 60;

        System.out.println("Array elements before left rotation:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Performing left rotation by one position
        int firstElement = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = firstElement;

        System.out.println("\nArray elements after left rotation:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
