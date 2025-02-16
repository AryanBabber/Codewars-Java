public class Square {
    public static boolean isSquare(int n) {
        return Math.pow(n, 0.5) % 1 == 0;
    }
}