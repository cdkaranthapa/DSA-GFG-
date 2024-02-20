public class TrailingZeroesinFact {
    static int trailzero(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(trailzero(251));
    }

}
