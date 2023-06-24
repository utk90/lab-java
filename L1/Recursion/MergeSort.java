package Recursion;

public class MergeSort {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        int len1 = mid - l + 1;
        int len2 = r - mid;

        int[] left = new int[len1];
        int[] right = new int[len2];

        int mainArrIdx = l;
        for (int i = 0; i < len1; i++) {
            left[i] = arr[mainArrIdx++];
        }

        // mainArrIdx = mid + 1;
        for (int i = 0; i < len2; i++) {
            right[i] = arr[mainArrIdx++];
        }

        // merge two sorted arrays
        int mainPtr = l;
        int ptr1 = 0;
        int ptr2 = 0;

        while (ptr1 < len1 && ptr2 < len2) {
            if (left[ptr1] > right[ptr2]) {
                arr[mainPtr++] = right[ptr2++];
            } else {
                arr[mainPtr++] = left[ptr1++];
            }
        }

        while (ptr1 < len1) {
            arr[mainPtr++] = left[ptr1++];
        }

        while (ptr2 < len2) {
            arr[mainPtr++] = right[ptr2++];
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);

        mergeSort(arr, mid + 1, r);

        merge(arr, l, r);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 3, 1, 0, 4, 1, 3, 2 };

        mergeSort(arr, 0, arr.length - 1);

        display(arr);
    }
}
