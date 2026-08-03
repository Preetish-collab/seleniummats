import java.util.Arrays;

public class FindHighestElementfromArray {
public static int getHighestNumber(int a[],int total) {
	Arrays.sort(a);
	return a[total-1];
	
}
public static void main(String[] args) {
	int a[]= {10,20,30,60,40,80};
	System.out.println(getHighestNumber(a,6));
}
}
