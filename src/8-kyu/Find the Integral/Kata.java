public class Kata {
    public static String integrate(int coefficient, int exponent) {
        return String.format("%dx^%d", coefficient / (exponent + 1), exponent + 1 );
    }
}