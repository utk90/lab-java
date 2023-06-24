package Recursion;

import java.util.Scanner;

public class CountStairs {
    public static int getWays(int n) {
        if (n <= 2) {
            return n;
        }
        return getWays(n - 1) + getWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n = scn.nextInt();
        System.out.println(getWays(n));
        scn.close();
    }
}
