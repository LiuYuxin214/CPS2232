package Unit4;

import java.util.Scanner;
import java.util.Stack;

public class PostfixNotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String expression = scanner.nextLine();
        char[] chars = expression.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        System.out.println("The result is " + stack.pop());
    }

}
