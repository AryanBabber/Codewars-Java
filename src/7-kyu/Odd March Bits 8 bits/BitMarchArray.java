
public class BitMarchArray {

    public static int[][] BitMarch(int n) {
        int steps = 9 - n;
        int[][] march = new int[steps][8];

        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < 8; j++) {
                march[i][j] = (j >= 8 - n - i && j <= 7 - i) ? 1 : 0;
            }
        }

        return march;
    }
}
