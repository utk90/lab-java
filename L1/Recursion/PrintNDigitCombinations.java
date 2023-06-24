package Recursion;

import java.util.Scanner;

public class PrintNDigitCombinations {
    public static void solve(int[] arr, int n, int idx, String soln) {
        if (idx == n) {
            System.out.println(soln);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            solve(arr, n, idx + 1, soln + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of digits: ");
        int n = scn.nextInt();
        solve(arr, n, 0, "");
        scn.close();
    }
}
