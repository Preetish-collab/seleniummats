import java.util.HashSet;

public class DuplicatesIdentify {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,10,20};
	HashSet<Integer>set=new HashSet<>();
	System.out.println("Duplicates Found");
	for(int value:arr) {
		if(!set.add(value)) {
			System.out.println(value);
		}
	}
}
}
