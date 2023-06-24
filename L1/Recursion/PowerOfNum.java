package Recursion;

import java.util.Scanner;

public class PowerOfNum {
    public static int getPow(int n, int p) {
        int res = 1;
        if (p == 0) {
            return 1;
        }
        if (p == 1) {
            return n;
        }
        int temp = getPow(n, p / 2);
        res = temp * temp;
        res = p % 2 == 0 ? res : n * res;

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to calculate power: ");
        int n = scn.nextInt();
        System.out.println("Enter power: ");
        int p = scn.nextInt();
        int res = getPow(n, p);
        System.out.println(res);
        scn.close();
    }
}
