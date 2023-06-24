public class SecondaryDiagonal {
    public static void main(String[] args) {
        int[][] mtrx = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // (0, col-1), (1, 1), (row-1, 0)

        int r = 0, c = mtrx[0].length - 1;

        while (c >= 0) {
            System.out.println(mtrx[r][c]);
            r++;
            c--;
        }
    }
}
