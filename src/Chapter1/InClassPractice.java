package Chapter1;

public class InClassPractice {
    public int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public int result(int n) {
        if (n == 1) {
            return 2;
        } else
            return 2 * result(n - 1);
    }

    public int mystery(int n, int a, int d) {
        if (n == 1) {
            return a;
        }
        return d + mystery(n - 1, a, d);
    }

    public int f(int k, int n) {
        if (n == k) {
            return k;
        } else if (n > k)
            return f(k, n - k);
        else
            return f(k - n, n);
    }

    public static void main(String[] args) {
        InClassPractice t = new InClassPractice();
        System.out.println(t.sum(5));
        System.out.println(t.result(5));
        System.out.println(t.mystery(3, 2, 6));
        System.out.println(t.f(6, 3));
    }
}
