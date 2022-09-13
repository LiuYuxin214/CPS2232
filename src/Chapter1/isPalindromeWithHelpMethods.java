package Chapter1;

public class isPalindromeWithHelpMethods {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int low, int high) {
        if (high <= low) // Base case
            return true;
        else if (s.charAt(low) != s.charAt(high)) // Base case
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }

    public static void main(String[] args) {
        String s = "abccba";
        System.out.println(isPalindrome(s));
    }
}
/*
One is to write the initial value into the method,
and the other is to use other methods to provide the initial value.
 */