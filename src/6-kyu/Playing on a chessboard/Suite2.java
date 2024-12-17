import java.util.Arrays;

public class Suite2 {

    public static String game(long n) {
        return n % 2 == 0 ? Arrays.toString(new long[] { (n / 2) * n })
                : Arrays.toString(new long[] { (long) Math.pow(n, 2), 2 });
    }
}