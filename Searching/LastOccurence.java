package Searching;

public class LastOccurence {
    static int lo(int arr[], int x) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == x) {
                if (mid == n - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr[mid] > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 3, 3, 4 };
        System.out.println(lo(arr, 3));
    }

}
