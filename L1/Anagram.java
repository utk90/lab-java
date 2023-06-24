import java.util.Arrays;

/*
    1. remove the spaces
    2. convert strings to lowercase
    3. convert string to character array
    4. sort the array and compare the elements
 */
public class Anagram {
    public static void main(String[] args) {
        String str1 = "School master";
        // String str2 = "The classroom";
        String str2 = "The classrooms";

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if (Arrays.equals(str1Arr, str2Arr)) {
            System.out.println("Strings are Anagram!!");
        } else {
            System.out.println("Strings are not Anagram!!");
        }
    }
}
