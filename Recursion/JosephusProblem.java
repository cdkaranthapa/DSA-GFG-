package Recursion;

public class JosephusProblem {
    static int Jos(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (Jos(n - 1, k) + k) % n;
    }

    public int josephus(int n, int k) {
        return Jos(n, k) + 1;
    }

    public static void main(String[] args) {
        System.out.println(Jos(7, 3));
    }
}
