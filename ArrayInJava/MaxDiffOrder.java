package ArrayInJava;

public class MaxDiffOrder {
    static int mdo(int arr[]) {
        int n = arr.length;
        int res = arr[1] - arr[0];
        int min = arr[0];
        for (int j = 1; j < n; j++) {
            res = Math.max(res, arr[j] - min);
            min = Math.min(min, arr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 10, 34, 6, 9 };
        System.out.println(mdo(arr));
    }
}
