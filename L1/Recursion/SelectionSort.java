package Recursion;

public class SelectionSort {
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

    public static int getMin(int[] arr, int idx) {
        int min = arr[idx];
        int minIdx = idx;

        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }

        return minIdx;
    }

    public static void sortArr(int[] arr, int idx, int range) {
        if (range == arr.length - 1) {
            return;
        } else if (idx == arr.length - 1) {
            range++;
            sortArr(arr, range, range);
        } else {
            int minIdx = getMin(arr, idx);
            int temp = arr[range];
            arr[range] = arr[minIdx];
            arr[minIdx] = temp;

            System.out.println("After " + (range + 1) + " Pass");
            display(arr);

            range++;
            sortArr(arr, range, range);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 4, 3, 1, 5, 0 };
        sortArr(arr, 0, 0);
        System.out.println("After sorting");
        display(arr);
    }
}
