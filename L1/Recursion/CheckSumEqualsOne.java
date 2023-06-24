package Recursion;

import java.util.Scanner;

public class CheckSumEqualsOne {
    public static boolean solve(int n, int sod) {
        if (n == 0 && sod == 1) {
            return true;
        }
        if (n == 0 && sod <= 9) {
            return false;
        }
        if (n == 0 && sod > 9) {
            return solve(sod, 0);
        }

        return solve(n / 10, sod + n % 10);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. to check sum of digits: ");
        int n = scn.nextInt();

        boolean ans = solve(n, 0);

        System.out.println("Sum of digits reduces to 1: " + ans);

        scn.close();
    }
}
