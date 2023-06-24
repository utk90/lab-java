package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void getSubsets(int[] arr, int idx, List<Integer> output, List<List<Integer>> res) {
        if (idx >= arr.length) {
            res.add(output);
            return;
        }

        // arr[idx] not included
        getSubsets(arr, idx + 1, new ArrayList<>(output), res);

        // arr[idx] included
        output.add(arr[idx]);
        getSubsets(arr, idx + 1, new ArrayList<>(output), res);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> list = new ArrayList<>();
        getSubsets(arr, 0, new ArrayList<>(), list);
        System.out.println(list);
    }
}
