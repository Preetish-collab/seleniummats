package collectionsjava;

import java.util.HashSet;
import java.util.Iterator;
//Set not allow duplicate values at runtime.heterogeneous values are allowed. Insertion order is not preserved.
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Grapes");
        hs.add("Apple"); // Duplicate value, will not be added
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}