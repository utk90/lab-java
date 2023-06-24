package Recursion;

public class CalcSum {
    public static int solve(int n, int res) {
        if (n == 0) {
            return res;
        }
        if (n % 2 == 0) {
            return solve(n - 1, res-n);
        } else {
            return solve(n - 1, res+n);
        }
    }

    public static void main(String[] args) {
        int n = 7; // 1-2+3-4+5
        System.out.println(solve(n, 0));
    }
}
