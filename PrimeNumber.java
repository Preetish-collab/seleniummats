import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a number");
	      int number=sc.nextInt();
	      for(int i=2;i<number/2;i++) {
	    	  if(number%2==0) {
	    		  System.out.println("Not a prime");
	    		  break;
	    	  }
	    	  else {
	    		  System.out.println("A prime");
	    		  break;
	    	  }
	      }
	}
}
