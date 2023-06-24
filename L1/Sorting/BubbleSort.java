package Sorting;

public class BubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void disp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 15, 3, 5, 2, 6, 4, 0 };
        int[] arr = { 1,2,3,4,5,6 };
        
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isNoSwap = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("swap " + arr[j] + " " + arr[j + 1]);
                    swap(arr, j, j + 1);
                    isNoSwap = false;
                }
            }

            System.out.print("Array after " + (i + 1) + " pass ");
            disp(arr);
            System.out.println();

            if (isNoSwap){
                break;
            }
        }
    }
}
