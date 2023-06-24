public class FinalVsImmutability {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Virat");
        sb.append("Kohli");
        System.out.println(sb);
        // sb = new StringBuffer("Sachin");
    }
}
