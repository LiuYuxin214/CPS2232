package Quiz1;

import java.util.LinkedList;

public class Q3<T> {
    LinkedList<T> list = new LinkedList<>();
    int size = 0;
    int index = 0;


    public void add(T item) {
        list.add(item);
        size++;
    }

    public T next() {
        if (index == size) {
            index = 0;
        }
        return list.get(index++);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Q3<Character> list = new Q3<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        System.out.println("Circular linked list nodes: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.next() + " ");
        }
    }
}
