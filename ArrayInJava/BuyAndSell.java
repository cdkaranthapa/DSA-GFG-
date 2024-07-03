package ArrayInJava;

public class BuyAndSell {
    static int bns(int arr[]) {
        int n = arr.length;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + arr[i] - arr[i - 1];
            }

        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 8, 12 };
        System.out.println(bns(arr));
    }
}
