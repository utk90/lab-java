public class SquareRoot {
    public static void main(String[] args) {
        int num = 24;
        int l = 0, r = num/2, mid = 0, ans = 0;

        while (l <= r) {
            mid = (l + r) / 2;

            if (mid * mid == num) {
                ans = mid;
                break;
            } else if (mid * mid > num) {
                r = mid - 1;
            } else if (mid * mid < num) {
                l = mid + 1;
                ans = mid;
            }
        }

        System.out.println("Square root of the number is " + ans);
    }
}
