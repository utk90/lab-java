package Recursion;

public class InsertionSort {
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

    public static void internalSort(int[] arr, int idx) {
        while (idx > 0) {
            if (arr[idx - 1] > arr[idx]) {
                swap(arr, idx - 1, idx);
            }
            idx--;
        }
    }

    public static void sortArr(int[] arr, int range) {
        if (range == arr.length) {
            return;
        } else {
            internalSort(arr, range);
            System.out.println("After " + range + " Pass");
            display(arr);
            range++;
            sortArr(arr, range);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 4, 3, 1, 5, 0 };
        sortArr(arr, 1);
        System.out.println("After sorting");
        display(arr);
    }
}
