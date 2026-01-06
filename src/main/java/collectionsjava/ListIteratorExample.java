package collectionsjava;

import java.util.ArrayList;
import java.util.ListIterator;

//it is userd to traverse the elements in both forward and backward direction
public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);

        ListIterator<Integer> litr = al.listIterator();
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
