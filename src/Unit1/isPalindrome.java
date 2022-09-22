package Unit1;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // Base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
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