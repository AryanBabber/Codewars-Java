public class Solution {
    public static String diagonal(int[][] matrix) {
        int m = 0, n = 0;

        for (int i = 0; i < matrix.length; i++) {
            m += matrix[i][i];
            n += matrix[i][matrix.length - i - 1];
        }

        return m > n ? "Principal Diagonal win!" : m < n ? "Secondary Diagonal win!" : "Draw!";
    }

    public static void main(String[] args) {
        System.out.println(diagonal(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
    }
}