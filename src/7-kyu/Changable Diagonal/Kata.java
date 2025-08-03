/*

On June 14th, 2025, I took my first ever UNT exam (United National Testing - the main exam in Kazakhstan). On that day, I faced this beginner-friendly task that I wanted to publish here.

Task
Given a matrix (NxN) and a specific value.

Input:

matrix = [[ 1,  2,  3,  4],
          [ 5,  6,  7,  8],
          [ 9, 10, 11, 12],
          [13, 14, 15, 16]]
 
value = 2
What this value does is it changes the main diagonal of the matrix. The main diagonal is basically the trace of the matrix (read this article, in case you are unaware of what the trace is).

If value > 0, then the main diagonal drops down.
If value < 0, the main diagonal goes up.
If value = 0, the diagonal does not change.

With this example here (I marked the diagonal numbers with *):

[[*1,   2,   3,   4],
 [ 5,  *6,   7,   8],
 [ 9,  10, *11,  12],
 [13,  14,  15, *16]]
 
The main diagonal here is [1, 6, 11, 16] but with given value:

[[ 1,   2,  3,  4],
 [ 5,   6,  7,  8],
 [*9,  10, 11, 12],
 [13, *14, 15, 16]]
 
The main diagonal is [9, 14].

In case of the value being negative, for example -2:

[[ 1,  2, *3,  4],
 [ 5,  6,  7, *8],
 [ 9, 10, 11, 12],
 [13, 14, 15, 16]]
 
The main diagonal is [3, 8].
With these rules being said, find the sum of the trace of a matrix with the given value. The value will never exceed or reach the length of an array.

Note for Java: The square brackets do not mean ArrayList<ArrayList<Integer>>. You will be dealing with regular int[][].

*/

public class Kata {
    public static int matrixDiagonal(int[][] matrix, int value){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int j = i - value;
            if (j >= 0 && j < n) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(matrixDiagonal(new int[][] {{1,2}, {3,4}}, 1));
    }
}