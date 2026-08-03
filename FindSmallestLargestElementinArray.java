

public class FindSmallestLargestElementinArray {
public static void main(String[] args) {
	int a[]= {76,12,58,98,122,7};
	int max=a[0];
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
		else if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.print("Min:: "+min);
	System.out.println();
	System.out.print("Max:: "+max);

	
}
}
