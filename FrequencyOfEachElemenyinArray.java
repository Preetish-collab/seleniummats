import java.util.HashMap;

public class FrequencyOfEachElemenyinArray {
	 public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 2, 1, 7, 8, 9};

	        HashMap<Integer, Integer> map = new HashMap<>();

	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	            
	        }

	        System.out.println(map);
	    }
}
