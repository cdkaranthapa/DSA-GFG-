class CountDigits {
    public static int digits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 75485788;
        System.out.println(digits(n));
    }
}