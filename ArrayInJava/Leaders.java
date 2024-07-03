package ArrayInJava;

public class Leaders {
    static void leaders(int arr[]) {
        int n = arr.length;
        int l = arr[n - 1];
        System.out.print(l + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > l) {
                l = arr[i];
                System.out.print(l + " ");
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 7, 10, 4, 5, 2 };
        leaders(arr);
    }
}
