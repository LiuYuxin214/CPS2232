package Chapter1;

import java.util.Random;

public class Duck {
    public static void duck(int n) {
        System.out.print("Stone " + n + " ");
        Random random = new Random();
        int endNum = random.nextInt(10) + 1;
        int add = random.nextInt(endNum) + 1;
        if (n + add > 11) {
            System.out.println();
        } else {
            duck(n + add);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Situation " + (i + 1) + ": ");
            duck(1);
        }
    }
}
