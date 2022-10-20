import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        System.out.print("pls enter a binary digits(0000 to 1111): ");
        Scanner input = new Scanner(System.in);
        String number = input.next();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(number.charAt(i) + "") * Math.pow(2, 3 - i);
        }
        System.out.println(sum);
    }
}
