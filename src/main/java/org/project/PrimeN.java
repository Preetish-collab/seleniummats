package org.project;

import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.println("Enter a Number:::");
       int number= sc.nextInt();
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                System.out.println("Not a Prime Number");
                break;
            }
else{
                System.out.println("Prime Number");
                break;
            }

        }
    }
}
