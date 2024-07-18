package Searching;

public class SqRoot {
    static int sr(int x) {
        int l = 0;
        int h = x;
        int ans = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            int msq = mid * mid;
            if (msq == x) {
                return mid;
            } else if (msq > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(sr(121));
    }
}
