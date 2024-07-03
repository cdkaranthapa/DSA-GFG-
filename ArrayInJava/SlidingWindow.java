package ArrayInJava;

public class SlidingWindow {
    static int sw(int arr[], int k) {
        int n = arr.length;
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr = curr + arr[i];
        }
        int res = curr;
        for (int i = k; i < n; i++) {
            curr = curr - arr[i - k] + arr[i];
            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -10, 5, 8, 0, 23 };
        System.out.println(sw(arr, 3));
    }
}
