package ArrayInJava;

public class Frequencies {
    static void freq(int arr[]) {
        int freq = 1;
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println("Frequency of " + arr[i - 1] + " is: " + freq);
                freq = 1;
            }
        }
        System.out.println("Frequency of " + arr[N - 1] + " is: " + freq);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 10, 30, 40, 50, 50, 50, 50, 50 };
        freq(arr);
    }
}
