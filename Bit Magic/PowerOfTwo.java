public class PowerOfTwo {
    public static boolean poweroftwo(long n) {
        if (n == 0)
            return false;
        for (long pow = 1; pow > 0; pow = pow << 1) {
            if (pow == n)
                return true;
            if (pow > n)
                return false;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(poweroftwo(2048));
    }
}