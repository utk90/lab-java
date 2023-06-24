package Recursion;

import java.util.Scanner;

public class SayDigits {
    public static void sayDigit(int n, String[] numText) {
        if (n == 0) {
            return;
        }

        sayDigit(n / 10, numText);
        System.out.print(numText[n % 10]+" ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter digits to get number text: ");
        int n = scn.nextInt();
        String[] numTextArr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        sayDigit(n, numTextArr);
        scn.close();
    }
}
