public class Reduce {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int[] myFraction(int[] fractions) {
        int gcd = gcd(fractions[0], fractions[1]);
        return new int[] { fractions[0] / gcd, fractions[1] / gcd };
    }
}