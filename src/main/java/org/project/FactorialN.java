package org.project;



import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:::");
        int number=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is:::"+fact);
    }
}
