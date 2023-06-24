package Recursion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void solve(List<Integer> tempAns, List<List<Integer>> ans, int idx) {
        if (idx >= tempAns.size()) {
            ans.add(new ArrayList<>(tempAns));
            return;
        }

        for (int i = idx; i < tempAns.size(); i++) {
            swap(tempAns, idx, i);
            solve(tempAns, ans, idx + 1);
            swap(tempAns, idx, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempAns = new ArrayList<>();

        for (int val : nums) {
            tempAns.add(val);
        }

        solve(tempAns, ans, 0);
        return ans;
    }
}