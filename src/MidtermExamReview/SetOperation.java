package MidtermExamReview;

import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(11);
        set1.add(22);
        set1.add(41);
        set1.add(81);
        set1.add(16);
        set1.add(32);
        set1.add(64);
        set2.add(22);
        set2.add(4);
        set2.add(81);
        set2.add(11);
        set2.add(25);
        set2.add(16);
        set2.add(49);
        set2.add(64);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        //set1.retainAll(set2);
        set1.removeAll(set2);
        System.out.println(set1);
        System.out.println(set2);

    }

}
