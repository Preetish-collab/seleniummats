
public class ArrayAscSort {
public static void main(String[] args) {
	int a[]=new int[] {12,4,2,19,97};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {  //2 4 12 19 97 for desc <
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println();
	for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
	}
}
}
