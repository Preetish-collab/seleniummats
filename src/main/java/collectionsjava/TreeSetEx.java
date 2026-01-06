package collectionsjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

    //TreeSet not allow duplicate values at runtime.heterogeneous values are not allowed. Insertion order is not preserved. It sorts the elements in ascending order.
   TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        ts.add(200);
        ts.add(600);
        ts.add(300);
        ts.add(400);
        ts.add(500);
        ts.add(300); // Duplicate value, will not be added

    Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
        System.out.println(itr.next());
    }
}
}
