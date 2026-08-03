import java.util.Scanner;

public class NumberPallindrome {
	 public static void main(String[] args) {
		    int num,original,reverse=0,remainder;
//		    Scanner sc=new Scanner(System.in);
//		    System.out.println("Enter a Number");
//		    num=sc.nextInt();
		    num=131;
		    original=num;
		    while(num!=0){
		        remainder=num%10;
		        reverse=reverse*10+remainder;
		        num=num/10;
		    }
		    if(original==reverse){
		        System.out.println("The Number is Pallindrome");
		    }
		    else{
		    System.out.println("The Number is Not Pallindrome");
		    }
}}
