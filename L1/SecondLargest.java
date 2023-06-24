public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 2, 0, 5, 2, 4 };
        int fmax = arr[0], smax = arr[0];

        for (int val : arr) {
            if (val > fmax) {
                smax = fmax;
                fmax = val;
            } else if (val < fmax && val > smax) {
                smax = val;
            }
        }

        System.out.println(fmax + ":" + smax);
    }
}