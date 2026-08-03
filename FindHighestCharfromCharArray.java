
public class FindHighestCharfromCharArray {
public static void main(String[] args) {
	char[]arr= {'a', 'z', 'b', 'k', 'm', 'y'};
	char maxchar=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>maxchar) {
			maxchar=arr[i];
		}
	}
	System.out.print("Max Character: "+maxchar);
}
}
