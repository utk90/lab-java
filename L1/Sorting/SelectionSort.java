package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1, 6, 0, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = arr[i];
            arr[i] = min;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}