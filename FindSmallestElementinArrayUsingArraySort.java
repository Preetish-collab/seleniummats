import java.util.Arrays;

public class FindSmallestElementinArrayUsingArraySort {
public static int getSmallestNumber(int a[],int total) {
	Arrays.sort(a);
	return a[0];
}
public static void main(String[] args) {
	int a[]= {1,2,5,6,9,8};
	int b[]= {10,26,53,62,90,80};
	System.out.println(getSmallestNumber(a,6));//1
	System.out.println(getSmallestNumber(b,6));//10
}
}
