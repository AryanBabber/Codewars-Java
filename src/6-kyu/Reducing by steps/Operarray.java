
import java.util.function.BiFunction;

public class Operarray {
    public static long gcdi(long x, long y) {
        return y == 0 ? Math.abs(x) : gcdi(y, x % y);
    }

    public static long lcmu(long a, long b) {
        return Math.abs(a * b) / gcdi(a, b);
    }

    public static long som(long a, long b) {
        return a + b;
    }

    public static long maxi(long a, long b) {
        return (long) Math.max(a, b);
    }

    public static long mini(long a, long b) {
        return (long) Math.min(a, b);
    }

    public static long[] operArray(BiFunction<Long, Long, Long> operator, long[] arr, long init) {
        long[] res = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            init = operator.apply(init, arr[i]);
            res[i] = init;
        }

        return res;
    }
}