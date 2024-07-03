package ArrayInJava;

public class Mjority {
    static int findmajority(int arr[]) {
        int n = arr.length;
        int count = 1;
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[res] == arr[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[res]) {
                count++;
            }
        }
        if (count <= n / 2) {
            res = -1;
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 2 };
        System.out.println(findmajority(arr));
    }
}
