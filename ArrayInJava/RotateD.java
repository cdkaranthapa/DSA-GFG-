package ArrayInJava;

public class RotateD {
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void rotate(int arr[], int d) {
        int n = arr.length;
        if (d > n) {
            d = d % n;
        }
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
