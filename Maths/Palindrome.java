public class Palindrome {
    static boolean ispalindrome(int num) {
        int res = 0;
        int rem = 0;
        int x = num;
        while (x > 0) {
            rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }
        return (res == num);
    }

    public static void main(String[] args) {
        int n = 675369;
        System.out.println(ispalindrome(n));
    }
}
