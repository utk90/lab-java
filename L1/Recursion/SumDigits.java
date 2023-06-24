package Recursion;

public class SumDigits {
    public static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }

        int dg = n % 10;
        return dg + sumDigit(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumDigit(n));
    }
}
