import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String str = new Scanner(System.in).next();
        System.out.println("Permutations of " + str + " are: ");
        char[] chars = str.toCharArray();
        permute(chars, 0, chars.length - 1);
    }

    public static void permute(char[] list, int start, int end) {
        if (start == end) {
            System.out.println(list);
        } else {
            for (int i = start; i <= end; i++) {
                swap(list, start, i);
                permute(list, start + 1, end);
                swap(list, start, i);
            }
        }
    }

    public static void swap(char[] list, int start, int end) {
        char temp = list[start];
        list[start] = list[end];
        list[end] = temp;
    }
}
