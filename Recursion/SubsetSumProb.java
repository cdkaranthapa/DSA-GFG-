package Recursion;

public class SubsetSumProb {
    static int ss(int n, int arr[], int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return ss(n - 1, arr, sum) + ss(n - 1, arr, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        int arr1[] = { 15, 10, 25 };
        System.out.println(ss(3, arr1, 0));
    }
}
