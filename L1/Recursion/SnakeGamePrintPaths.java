package Recursion;

public class SnakeGamePrintPaths {
    public static void solve(int s, int e, String path) {
        if (s > e) {
            return;
        }
        if (s == e) {
            System.out.println(path);
        }

        solve(s + 1, e, path + "1");
        solve(s + 2, e, path + "2");
        solve(s + 3, e, path + "3");
        solve(s + 4, e, path + "4");
        solve(s + 5, e, path + "5");
        solve(s + 6, e, path + "6");
    }

    public static void main(String[] args) {
        solve(0, 10, "");
    }
}
