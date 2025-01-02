public class NegativeZeroValidator {
    public static boolean isNegativeZero(float n) {
        return Double.doubleToRawLongBits(n) == Double.doubleToRawLongBits(-0.0);
    }
}