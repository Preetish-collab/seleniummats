import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveDuplicates {
	public static void main(String[] args) {
		  Integer[] numbers = {1, 3, 2, 3, 4, 4, 5};

		 Set<Integer>set=new HashSet<Integer>();
		  for(int num:numbers) {
			  set.add(num);
		  }
		  System.out.print(set);
}
}
