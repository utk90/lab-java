package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void revStr(String str, int idx) {
        if (idx == str.length() - 1) {
            System.out.print(str.charAt(idx));
            return;
        }
        revStr(str, idx + 1);
        System.out.print(str.charAt(idx));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string to reverse: ");
        String str = scn.nextLine();

        revStr(str, 0);
        System.out.println();
        scn.close();
    }
}
