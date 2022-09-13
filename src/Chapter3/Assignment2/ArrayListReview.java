package Chapter3.Assignment2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListReview<T> {
    //Create with the generic type of the passed class
    ArrayList<T> arrayList = new ArrayList<>();
    LinkedList<T> linkedList = new LinkedList<>();

    ArrayListReview(int index, T item) {
        arrayList.add(index, item);
        linkedList.add(index, item);
    }

    public void addArray(int index, T item) {
        arrayList.add(index, item);
    }

    public void addLinkedList(T item) {
        linkedList.add(item);
    }
}
