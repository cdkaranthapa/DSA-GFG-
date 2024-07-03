package ArrayInJava;

public class Prefixsum {
    static int psum[] = { 2, 10, 12, 22, 28, 33, 37 };

    static int getsum(int l, int r) {
        if (l == 0) {
            return psum[r];
        } else {
            return psum[r] - psum[l - 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(getsum(0, 2));
    }
}
