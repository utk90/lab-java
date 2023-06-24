package Recursion;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortArray(int[] arr, int idx, int range) {
        if (range == 0) {
            return;
        } else if (idx == range) {
            System.out.println("After " + range + " pass");
            display(arr);
            range--;
            sortArray(arr, 0, range);
        } else if (arr[idx] > arr[idx + 1]) {
            swap(arr, idx, idx + 1);
            sortArray(arr, idx + 1, range);
        } else {
            sortArray(arr, idx + 1, range);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 4, 3, 1, 5, 0 };
        sortArray(arr, 0, arr.length - 1);
        System.out.println("After sorting");
        display(arr);
    }
}
