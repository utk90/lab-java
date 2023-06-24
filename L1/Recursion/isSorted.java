package Recursion;

public class isSorted {
    public static boolean checkSorted(int[] arr, int idx) {
        if (arr.length <= 1) {
            return true;
        } else if (idx >= arr.length - 1) {
            return true;
        } else if (arr[idx] > arr[idx + 1]) {
            return false;
        } else {
            return checkSorted(arr, idx + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 5, 4, 7 };
        System.out.println(checkSorted(arr, 0));
    }
}
