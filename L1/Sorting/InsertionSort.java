package Sorting;

public class InsertionSort{
    public static void main(String[] args){
        int[] arr = {50,23,42,-1,10,0,3,5,4,5,9,1};

        // [23, 42, 50]

        // for (int i=1; i<arr.length; i++){
        //     int temp = arr[i];
        //     int j=i-1;
        //     for (; j>=0; j--){
        //         if (temp<arr[j]){
        //             arr[j+1] = arr[j];
        //         } else{
        //             break;
        //         }
        //     }
        //     arr[j+1] = temp;
        // }

        for (int i=1; i<arr.length; i++){
            int j=i;

            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }

        for (int item: arr){
            System.out.print(item+" ");
        }
    }
}