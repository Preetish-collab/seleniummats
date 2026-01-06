package collectionsjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    //LinkedHashset not allow duplicate values at runtime.heterogeneous values are allowed. Insertion order is  preserved.
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
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
