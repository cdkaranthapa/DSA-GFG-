package ArrayInJava;

public class LargestElement {
    static int l(int arr[], int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 10, 10 };
        System.out.println(l(arr, arr.length));
    }
}
