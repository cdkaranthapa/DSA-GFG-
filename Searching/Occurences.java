package Searching;

public class Occurences {
    static int fo(int arr[], int x) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == x) {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    h = mid - 1;
                }
            } else if (arr[mid] > x) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

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

    static int occ(int arr[], int x) {
        int first = fo(arr, x);
        if (first == -1) {
            return 0;
        } else
            return lo(arr, x) - first + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 3, 3, 4 };
        System.out.println(occ(arr, 3));
    }
}
