package Searching;

public class PeakElement {
    static int peak(int arr[]) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
                return mid;
            if (mid > 0 && arr[mid - 1] >= arr[mid])
                h = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 30, 45, 60, 65, 54, 90, 23, 67 };
        System.out.println(peak(arr));
    }
}
