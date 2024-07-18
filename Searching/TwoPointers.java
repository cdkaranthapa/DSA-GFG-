package Searching;

public class TwoPointers {
    static boolean tp(int arr[], int s) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;

        while (l < h) {
            if (arr[l] + arr[h] == s) {
                return true;
            } else if (arr[l] + arr[h] > s) {
                h--;
            } else {
                l++;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 23, 42, 51, 66, 92 };
        System.out.println(tp(arr, 70));

    }
}
