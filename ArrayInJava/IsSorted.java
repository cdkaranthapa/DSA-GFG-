package ArrayInJava;

public class IsSorted {
    static boolean is(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 12 };
        System.out.println(is(arr, arr.length));
    }
}
