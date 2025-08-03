public class Kata {
    public static String helpZoom(final int[] key) {
        int n = key.length;

        for (int i = 0; i < n / 2; i++) {
            if (key[i] != key[n - i - 1])
                return "No";
        }

        return "Yes";
    }
};