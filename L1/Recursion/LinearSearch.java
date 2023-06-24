package Recursion;

public class LinearSearch {
    public static boolean isTargetFound(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return false;
        } else if (arr[idx] == target) {
            return true;
        } else {
            return isTargetFound(arr, target, idx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 0, 4, 5, 2 };
        int target = 6;

        System.out.println(isTargetFound(arr, target, 0));
    }
}
