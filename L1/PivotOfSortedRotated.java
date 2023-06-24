public class PivotOfSortedRotated {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 10, 1, 2, 3, 5, 6 };
        int l = 0, r = arr.length - 1, mid = 0, pivot = -1;

        while (l <= r) {
            mid = (l + r) / 2;

            // upper level
            if (arr[mid] > arr[0]) {
                l = mid + 1;
            } else {
                // pivot or lower level
                if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                    pivot = mid;
                    break;
                } else {
                    r = mid - 1;
                }
            }
        }

        System.out.println("Pivot index is " + pivot);
    }
}
