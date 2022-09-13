package Chapter3;

import java.util.ArrayList;

public class ClassExercise {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Double> arr2 = new ArrayList<>();
        ArrayList<Character> arr3 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr2.add(1.1);
        arr2.add(2.2);
        arr2.add(3.3);
        arr2.add(4.4);
        arr2.add(5.5);
        arr3.add('H');
        arr3.add('e');
        arr3.add('l');
        arr3.add('l');
        arr3.add('o');
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
    }
}
