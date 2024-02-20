public class CheckForPrime {
    /*
     * static boolean isPrime(int n) {
     * if (n == 0)
     * return false;
     * for (int i = 2; i < n; i++) {
     * if (n % i == 0)
     * return false;
     * else
     * return true;
     * }
     * return false;
     * 
     * }
     */
    static boolean isPrime(int n) {
        if (n == 0)
            return false;
        if (n == 2 || n == 3)
            return true;
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(97));
    }
}
