import java.util.Arrays;

public class NumberSort {
	public static void main(String args[]) {
     int n=9439308;
	
	String s=String.valueOf(n);
	char[] c=s.toCharArray();
	Arrays.sort(c);
	for(int i=0;i<c.length;i++)
	{
	System.out.print(c[i]);//0334899
	}
	
//for descending order
//	for (int i=ch.length-1;i>=0;i--){
//	       System.out.print(" "+ch[i]);
//	      
//	   }


	}
}
