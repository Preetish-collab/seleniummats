import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
	  public static void main(String[] args) {
	       HashMap<Integer,String>map=new HashMap<>();
	       map.put(2, "Mango");
	       map.put(1, "Grapes");
	       map.put(3, "Banana");
	       System.out.println("Iterating Map");
	       TreeMap<Integer,String>tm=new TreeMap<>(map);//for sorting
	       for(Map.Entry m:tm.entrySet()){
	           System.out.println(m.getKey()+" "+m.getValue());
	       }
	    }
}
