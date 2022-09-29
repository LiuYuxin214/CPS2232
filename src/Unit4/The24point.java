package Unit4;

import java.util.ArrayList;
import java.util.Scanner;

public class The24point {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        System.out.print("Please enter 4 numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }
        int target = 24;
        System.out.println("Your entered numbers are: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3]);
        System.out.println("The solution is: ");
        if (!findSolution(numbers, target)) {
            System.out.println("No solution");
        }
    }

    static boolean findSolution(int[] numbers, int target) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i) continue;
                temp.add(numbers[i] + numbers[j]);
                operations.add(numbers[i] + " + " + numbers[j]);
                temp.add(numbers[i] - numbers[j]);
                operations.add(numbers[i] + " - " + numbers[j]);
                temp.add(numbers[j] - numbers[i]);
                operations.add(numbers[j] + " - " + numbers[i]);
                temp.add(numbers[i] * numbers[j]);
                operations.add(numbers[i] + " * " + numbers[j]);
                temp.add(numbers[i] / numbers[j]);
                operations.add(numbers[i] + " / " + numbers[j]);
                temp.add(numbers[j] / numbers[i]);
                operations.add(numbers[j] + " / " + numbers[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                if (j == i) continue;
                if (temp.get(i) + temp.get(j) == 24 && isNotSame(operations.get(i), operations.get(j))) {
                    System.out.println("(" + operations.get(i) + ") + (" + operations.get(j) + ") = 24");
                    return true;
                } else if (temp.get(i) - temp.get(j) == 24 && isNotSame(operations.get(i), operations.get(j))) {
                    System.out.println("(" + operations.get(i) + ") - (" + operations.get(j) + ") = 24");
                    return true;
                } else if (temp.get(j) - temp.get(i) == 24 && isNotSame(operations.get(j), operations.get(i))) {
                    System.out.println("(" + operations.get(j) + ") - (" + operations.get(i) + ") = 24");
                    return true;
                } else if (temp.get(i) * temp.get(j) == 24 && isNotSame(operations.get(i), operations.get(j))) {
                    System.out.println("(" + operations.get(i) + ") * (" + operations.get(j) + ") = 24");
                    return true;
                } else if (temp.get(j) != 0) {
                    if (temp.get(i) / temp.get(j) == 24 && isNotSame(operations.get(i), operations.get(j))) {
                        System.out.println("(" + operations.get(i) + ") / (" + operations.get(j) + ") = 24");
                        return true;
                    }
                } else if (temp.get(i) != 0) {
                    if (temp.get(j) / temp.get(i) == 24 && isNotSame(operations.get(j), operations.get(i))) {
                        System.out.println("(" + operations.get(j) + ") / (" + operations.get(i) + ") = 24");
                        return true;
                    }
                }
            }

        }
        return false;
    }

    static boolean isNotSame(String o1, String o2) {
        char[] c1 = o1.toCharArray();
        char[] c2 = o2.toCharArray();
        int a = Integer.parseInt(c1[0] + "");
        int b = Integer.parseInt(c1[4] + "");
        int c = Integer.parseInt(c2[0] + "");
        int d = Integer.parseInt(c2[4] + "");
        if (a == c) return false;
        if (a == d) return false;
        if (b == c) return false;
        return b != d;
    }
}
