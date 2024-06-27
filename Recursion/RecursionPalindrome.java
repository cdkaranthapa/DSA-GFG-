package Recursion;

public class RecursionPalindrome {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) == s.charAt(end))
            return isPalindrome(s, start + 1, end - 1);

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aabaaa", 0, 5));
    }
}
