package Searching;

public class SearchingInRA {
    static int sira(int arr[], int x) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[l] <= arr[mid]) {
                if (x >= arr[l] && x < arr[mid]) {
                    h = mid - 1;
                } else
                    l = mid + 1;
            } else {
                if (x < arr[h] && x >= arr[mid]) {
                    l = mid + 1;
                } else
                    h = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 22, 1, 2 };
        System.out.println(sira(arr, 8));
    }
}
