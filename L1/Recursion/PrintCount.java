package Recursion;

import java.util.Scanner;

public class PrintCount {
    public static void printCount(int n) {
        if (n == 0) {
            return;
        }
        printCount(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to start count from: ");
        int n = scn.nextInt();
        printCount(n);
        scn.close();
    }
}
