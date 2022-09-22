package Unit4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsVSGet {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            array.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = array.size() - 1; i >= 0; i--) {
            array.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("get: " + (end - start));
        start = System.currentTimeMillis();
        Iterator<Integer> iter = array.iterator();
        while (iter.hasNext()) {
            iter.next();
        }
        end = System.currentTimeMillis();
        System.out.println("iterator: " + (end - start));

    }
}
