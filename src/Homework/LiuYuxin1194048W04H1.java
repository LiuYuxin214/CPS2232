package Homework;

import java.util.Random;

public class LiuYuxin1194048W04H1 {
    public static void duck(int n) {
        System.out.println("The duck jumped onto the stone " + n + ".");
        Random random = new Random();
        int add = random.nextInt(10) + 1;
        if (n + add > 11) {
            System.out.println("The duck jumped to the other bank.");
        } else {
            duck(n + add);
        }
    }

    public static void main(String[] args) {
        System.out.println("The duck began to jump on the stone.");
        duck(1);
    }
}
