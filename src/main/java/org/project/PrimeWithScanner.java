package org.project;

import java.util.Scanner;

public class PrimeWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                break;
            }
            System.out.println(num + " is  a prime number.");
            break;
        }

    }
}