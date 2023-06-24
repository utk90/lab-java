package Recursion;

public class BinarySearch {
    public static void display(int[] arr, int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean isPresent(int[] arr, int target, int l, int r) {
        display(arr, l, r);
        if (l > r) {
            return false;
        } else {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                return isPresent(arr, target, l, mid - 1);
            } else {
                return isPresent(arr, target, mid + 1, r);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 8, 9, 12 };
        int target = 3;

        System.out.println(isPresent(arr, target, 0, arr.length - 1));
    }
}
