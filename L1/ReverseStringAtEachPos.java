public class ReverseStringAtEachPos {
    public static void main(String[] args) {
        String str = "This is a test string.";
        String revStr = "";

        String[] splitStr = str.split(" ");
        for (String strItem : splitStr) {
            for (int ind = strItem.length() - 1; ind >= 0; ind--) {
                revStr += strItem.charAt(ind);
            }
            revStr += " ";
        }

        System.out.println(revStr);
    }
}