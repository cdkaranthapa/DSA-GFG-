package Recursion;

public class SubstrinTest {
    public static void main(String[] args) {

        String str = "5/67466, 11/45355";
        int n = str.length();
        int sp = str.indexOf(' ');
        String str1 = str.substring(0, sp - 1);
        String str2 = str.substring(sp + 1, n);
        System.out.println(str1 + " " + str2);

    }

}
