package ArrayInJava;

public class SubSum {
    static boolean sumofsub(int arr[], int sum) {
        int n = arr.length;
        int curr = 0;
        int s = 0;
        for (int i = 0; i < n; i++) {
            curr += arr[i];
            while (curr > sum) {
                curr = curr - arr[s];
                s++;
            }
            if (sum == curr) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        System.out.println(sumofsub(arr, 33));
    }
}
