package ArrayInJava;

public class SecondLargest {
    static int l2(int arr[], int n) {
        int l = arr[0];
        int l2 = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > l) {
                l2 = l;
                l = arr[i];
            } else if (arr[i] < l && arr[i] > l2) {
                l2 = arr[i];
            }
        }

        return l2;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10 };
        System.out.println(l2(arr, arr.length));
    }
}
