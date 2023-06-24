package Recursion;

public class ArraySum {
    public static int getSum(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        return arr[idx] + getSum(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 2, 9 };
        System.out.println(getSum(arr, 0));
    }
}
