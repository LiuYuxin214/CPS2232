package Quiz1;

import java.util.LinkedList;

public class Q2<T> {
    LinkedList<T> list = new LinkedList<>();
    int size = 0;
    int index = 0;

    public static void main(String[] args) {
        Q2<String> list = new Q2<>();
        list.add("Wenzhou");
        list.add("Beijing");
        list.add("Ningbo");
        list.add("Chongqing");
        list.add("Hangzhou");
        System.out.print("Linked List: ");
        System.out.println(list.list);
        System.out.print("Linked List in reverse order: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.previous() + " ");
        }
    }

    public void add(T item) {
        list.add(item);
        size++;
    }

    public T previous() {
        if (index == 0) {
            index = size;
        }
        return list.get(--index);
    }

    public int size() {
        return size;
    }
}
