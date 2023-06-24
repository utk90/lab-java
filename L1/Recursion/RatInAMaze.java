package Recursion;

import java.util.ArrayList;

public class RatInAMaze {
    public static void solve(int[][] arr, int n, int i, int j, String path, ArrayList<String> ans,
            boolean[][] visited) {
        if (i >= n || i < 0 || j >= n || j < 0 || arr[i][j] == 0 || visited[i][j]) {
            return;
        }

        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        visited[i][j] = true;
        solve(arr, n, i + 1, j, path + "D", ans, visited); // down
        solve(arr, n, i, j - 1, path + "L", ans, visited); // left
        solve(arr, n, i, j + 1, path + "R", ans, visited); // right
        solve(arr, n, i - 1, j, path + "U", ans, visited); // up
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        int n = 2;
        int[][] arr = { { 1, 0 }, { 1, 1 } };
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        solve(arr, n, 0, 0, "", ans, visited);
        System.out.println("ANS: " + ans);
    }
}