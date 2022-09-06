import com.sun.source.doctree.SummaryTree;

import java.util.Random;
import java.util.Scanner;

class ArrayReview {
    int[] data;

    public ArrayReview(int length) {
        data = new int[length];
    }

    public void randomize() {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(data.length) + 1;
        }//Generate random numbers from 1 to array length with java random number generator.
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public int get(int index) {
        return data[index];
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            result.append(data[i]).append(" ");
        }
        return result.toString();
    }//Use StringBuilder to connect each number in the data into a string.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            ArrayReview array = new ArrayReview(input.length);
            for (int j = 0; j < input.length; j++) {
                if (input[j].equals("blue"))
                    array.set(j, 1);
                else
                    array.set(j, 0);
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < input.length; j++) {
                if (array.get(j) == 1)
                    sum1++;
                else if (array.get(j) == 0)
                    sum2++;
            }
            if ((double) sum1 / (sum1 + sum2) >= 0.5)
                System.out.println("Passed");
            else
                System.out.println("Failed");
        }

    }
    /*
    Mark blue as 1 and other colors as 0,
    put them into the ArrayReview object,
    and then calculate the number of 0 and 1,
    then calculate the proportion, and then draw a conclusion.
     */
}
