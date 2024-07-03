package ArrayInJava;

public class Kadane {
    static int maxsubarray(int arr[]) {
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 0; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -6, 8, 0, 7, -9, 9 };
        System.out.println(maxsubarray(arr));
    }
}
