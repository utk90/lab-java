package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n) {
        if (n <= 1) {
            return n;
        }

        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to calculate factorial: ");
        int n = scn.nextInt();
        System.out.println(getFactorial(n));
        scn.close();
    }
}
