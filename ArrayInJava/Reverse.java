package ArrayInJava;

public class Reverse {
    static int[] rev(int arr[], int n) {
        int l = 0;
        int h = n - 1;
        while (l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            h--;
            l++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 7, 1, 0 };
        System.out.println("Before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        rev(arr, arr.length);
        System.out.println("after:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
