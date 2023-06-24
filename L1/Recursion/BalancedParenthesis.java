package Recursion;

public class BalancedParenthesis {
    // balanced parenthesis valid : (()), (()) invalid: )()(

    // oc-open count, cc-close count
    public static void solve(int n, int oc, int cc, String ans) {
        if (oc == n && cc == n) {
            System.out.println(ans);
            return;
        }

        if (oc < n) {
            solve(n, oc + 1, cc, ans + "(");
        } 

        if (cc < oc) {
            solve(n, oc, cc + 1, ans + ")");
        }
    }

    public static void main(String[] args) {
        int n = 2;
        solve(n, 0, 0, "");
    }
}
