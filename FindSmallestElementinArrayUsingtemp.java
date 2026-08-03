
public class FindSmallestElementinArrayUsingtemp {
public static int getSmallestNumber(int[]a,int total) {
	int temp;
	for(int i=0;i<total;i++) {
		for(int j=i+1;j<total;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		
	}
	return a[0];
	
}
public static void main(String[] args) {
	int a[]= {21,67,77,34,88,55};
	System.out.println(getSmallestNumber(a,6));//1
	
}

}
