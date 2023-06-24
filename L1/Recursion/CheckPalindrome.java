package Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str, int l) {
        if (l == str.length() / 2) {
            return true;
        } else if (str.charAt(l) != str.charAt(str.length() - 1 - l)) {
            return false;
        } else {
            return checkPalindrome(str, l + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter string to check palindrome: ");
        String str = scn.nextLine();

        System.out.println(checkPalindrome(str, 0));
        scn.close();
    }
}
