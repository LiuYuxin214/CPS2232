package Quiz1;

import java.util.Iterator;
import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Green");
        list.add("Yellow");
        list.add("Blue");
        Iterator<String> iterator = list.iterator();
        System.out.println("LinkedList elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
