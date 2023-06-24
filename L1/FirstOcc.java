public class FirstOcc {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 5, 5, 6, 7, 8 };
        int target = 5;
        int l = 0, r = arr.length - 1, mid = 0, tempIdx = -1;

        while (l <= r) {
            mid = (l + r) / 2;

            if (arr[mid] == target) {
                r = mid - 1;
                tempIdx = mid;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("First occurence of target occurs at " + tempIdx);
    }
}
