package org.project;

public class Fibbonnacccii {
    public static void main(String[] args) {
        int firstNumber=0;
        int secondNumber=1;

        System.out.print(firstNumber);
        System.out.print(secondNumber);
        for(int i=2;i<10;i++){
            int thirdNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
            System.out.print(thirdNumber);

        }

    }
}
