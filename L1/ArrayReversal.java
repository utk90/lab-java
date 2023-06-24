public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = { 10, 21, 9, 2, 22 };

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        for (int val: arr){
            System.out.print(val+" ");
        }
    }
}