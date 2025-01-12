public class ModSystem {
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static boolean arePairwiseCoprime(int[] sys) {
        for (int i = 0; i < sys.length; i++) {
            for (int j = i + 1; j < sys.length; j++) {
                if (gcd(sys[i], sys[j]) != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String fromNb2Str(int n, int[] sys) {

        long product = 1;
        for (int num : sys) {
            product *= num;

            if (product > n) {
                break;
            }
        }

        if (product <= n || !arePairwiseCoprime(sys)) {
            return "Not applicable";
        }

        StringBuilder result = new StringBuilder();
        for (int num : sys) {
            result.append("-").append(n % num).append("-");
        }

        return result.toString();
    }
}
