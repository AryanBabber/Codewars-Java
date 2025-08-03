
public class Solution {
    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        int sum = 0;
        for (int[] pair : pairs) {
            int product = pair[0] * pair[1];
            int respectiveLCM = lcm(pair[0], pair[1]);
            sum += product - respectiveLCM;
        }
        return sum;
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    private static int lcm(int a, int b) {
        return a * b == 0 ? 0 : (a * b) / gcd(a, b);
    }
}