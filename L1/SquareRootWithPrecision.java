import java.util.Scanner;

public class SquareRootWithPrecision {
    public static int sqrtInteger(int n) {
        int l = 0, r = n, mid = 0, sqrt = 0;

        while (l <= r) {
            mid = (l + r) / 2;

            if (mid * mid == n) {
                sqrt = mid;
                break;
            } else if (mid * mid > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
                sqrt = mid;
            }
        }

        return sqrt;
    }

    public static double sqrtPrecision(int n, int intFac, int precision) {
        double acc = 1;
        double ans = intFac;

        for (int i = 0; i < precision; i++) {
            acc *= 0.1;

            for (double j = ans; j * j < n; j += acc) {
                ans = j;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int intFac = sqrtInteger(n);
        double precionFac = sqrtPrecision(n, intFac, 3);

        System.out.println(precionFac);

        scn.close();
    }
}
