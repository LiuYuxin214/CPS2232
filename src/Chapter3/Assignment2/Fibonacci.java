package Chapter3.Assignment2;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayListReview<Long> list = new ArrayListReview<>(0, 0L);
        list.addArray(1, 1L);
        for (int i = 2; i < 51; i++) {
            list.addArray(i, list.arrayList.get(i - 1) + list.arrayList.get(i - 2));
        }
        System.out.println(list.arrayList.get(50));
    }
}
