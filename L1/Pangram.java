public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over lazy dog";
        str = str.replace(" ", "");
        str = str.toLowerCase();

        int[] checkArr = new int[26];

        for (char ch : str.toCharArray()) {
            checkArr[ch - 97]++;
        }

        for (int val : checkArr) {
            if (val == 0) {
                System.out.println("Not a pangram!!");
                return;
            }
        }

        System.out.println("String is a pangram!!");
    }
}
