package Recursion;

import java.util.ArrayList;

public class SubsequenceOfStrings {
    public static void findSubsequences(String str, int idx, String outputStr, ArrayList<String> res) {
        if (idx == str.length()) {
            if (outputStr.length() > 0) {
                res.add(outputStr);
            }
            return;
        }

        findSubsequences(str, idx + 1, outputStr, res);

        outputStr += str.charAt(idx);
        findSubsequences(str, idx + 1, outputStr, res);
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = new ArrayList<>();
        findSubsequences(str, 0, "", res);
        System.out.println(res);
    }
}
