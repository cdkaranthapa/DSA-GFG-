package ArrayInJava;

public class RemoveDup {
    static int rd(int arr[], int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20, 20, 30, 30, 40 };
        int nd = rd(arr, arr.length);
        System.out.println(nd);
        for (int i = 0; i < nd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
