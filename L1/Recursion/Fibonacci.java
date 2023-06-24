package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int getFib(int n) {
        if (n <= 1) {
            return n;
        }

        int res = getFib(n - 1) + getFib(n - 2);
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to get nth fibonacci result: ");
        int n = scn.nextInt();
        System.out.println(getFib(n));
        scn.close();
    }
}
