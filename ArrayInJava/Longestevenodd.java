package ArrayInJava;

public class Longestevenodd {
    static int leo(int arr[]) {
        int curr = 1;
        int n = arr.length;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i - 1] % 2 == 0 && arr[i] % 2 != 0)) {
                curr++;
                res = Math.max(curr, res);
            } else
                curr = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(leo(arr));
    }
}
