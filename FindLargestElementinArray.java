
public class FindLargestElementinArray {
public static void main(String[] args) {
	int arr[]=new int[] {23,45,12,66,73};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Largest Element is::: "+max);
}
}
