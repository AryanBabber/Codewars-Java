public class DRoot {
    public static int digital_root(int n) {
        if (n < 10)
            return n;
        
        return digital_root(sumDigits(n));
    }

    private static int sumDigits(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }

        return ans;
    }
}