import java.util.LinkedList;

public class CircleLinkedList<T> {
    LinkedList<T> list = new LinkedList<>();
    int size = 0;
    int index = 0;

    public static void main(String[] args) {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(list.next() + " ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(list.previous() + " ");
        }
    }

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

    public T previous() {
        if (index == 0) {
            index = size;
        }
        return list.get(--index);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return size;
    }
}
