package Recursion;

public class QuickSort {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int cnt = 0;

        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < pivot) {
                cnt++;
            }
        }

        int pivotIdx = l + cnt;

        // positioning pivot at right index
        swap(arr, l, pivotIdx);

        int i = l, j = r;

        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] < arr[pivotIdx]) {
                i++;
            }
            while (arr[j] > arr[pivotIdx]) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        // partition
        int partitionIdx = partition(arr, l, r);

        // left part sort
        quickSort(arr, l, partitionIdx - 1);

        // right part sort
        quickSort(arr, partitionIdx + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 9, 0, 4, 5, 1, 0, -1, 0, -3 };
        // place pivot element at right position
        // [left] < pivot < [right]
        // sort left and right halves

        quickSort(arr, 0, arr.length - 1);

        display(arr);
    }
}
