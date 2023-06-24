public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
        int target = 8;

        int l = 0, r = arr.length - 1, mid, findIdx = -1;

        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] > target) {
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                findIdx = mid;
                break;
            }
        }

        System.out.println("Element found at " + findIdx);
    }
}