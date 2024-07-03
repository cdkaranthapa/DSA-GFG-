package ArrayInJava;

public class MoveZeroes {
    static void mz(int arr[]) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // swap not change
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 7, 9, 0, 6, 0, 0 };
        mz(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
