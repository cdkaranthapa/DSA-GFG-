package Searching;

public class BinarySearch {
    static int bs(int arr[], int x) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 10, 13, 16 };
        System.out.println(bs(arr, 13));
    }
}
