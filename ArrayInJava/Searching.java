package ArrayInJava;

public class Searching {
    static int search(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 8, 9, 19, 1, 5 };
        System.out.println(search(arr, 8, 5));
    }
}
