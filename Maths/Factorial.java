public class Factorial {
    static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        int x = 1;
        while (n > 0) {
            x = x * n;
            n--;
        }
        return x;

    }

    public static void main(String[] args) {
        System.out.println(fact(0));
    }
}
