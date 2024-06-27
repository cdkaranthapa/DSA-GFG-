package Recursion;

public class RopeProblem {
    static int maxpieces(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = Math.max(Math.max(maxpieces(n - a, a, b, c), maxpieces(n - b, a, b, c)), maxpieces(n - c, a, b, c));
        if (res == -1)
            return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxpieces(23, 11, 14, 12));
    }

}
