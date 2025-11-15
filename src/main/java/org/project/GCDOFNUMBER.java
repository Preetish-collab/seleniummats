package org.project;

public class GCDOFNUMBER {
    public static void main(String[] args) {
        int x=12 ,y=8,gcd=1;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0)
//storing the variable i in the variable gcd
                gcd = i;
        }
//prints the gcd
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }
    }

