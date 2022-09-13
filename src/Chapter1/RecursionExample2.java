package Chapter1;

public class RecursionExample2 {
    static int count = 0;

    static void p() {
        count++;
        if (count <= 5) {
            System.out.println("hello 你好" + count);
            p();
        }

    }

    public static void main(String[] args) {
        p();
    }
}
