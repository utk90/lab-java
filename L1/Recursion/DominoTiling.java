package Recursion;

public class DominoTiling {
    public static int solve(int m, int n) {
        if (n <= 3) {
            return n;
        }

        if (n < 0) {
            return 0;
        }

        // vertical
        int vans = solve(m, n - 1);
        // horizontal
        int hans = solve(m, n - 2);

        return vans + hans;
    }

    public static void main(String[] args) {
        // 2*1 tiles available to floor 2*n board
        System.out.println("ways: "+ solve(2, 5));
    }
}