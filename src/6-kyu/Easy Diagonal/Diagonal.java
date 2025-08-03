
import java.math.BigInteger;

public class Diagonal {
    public static BigInteger diagonal(int n, int p) {
        BigInteger result = BigInteger.ONE;

        for (int i = 0; i < p + 1; i++) {
            result = result.multiply(BigInteger.valueOf(n + 1 - i))
                    .divide(BigInteger.valueOf(i + 1));
        }

        return result;
    }
}