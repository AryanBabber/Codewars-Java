import java.util.*;

public class PowerSumDig {
    public static long powerSumDigTerm(int n) {
        TreeSet<Long> resultSet = new TreeSet<>();

        for (int base = 2; base < 100; base++) {
            long value = base;
            for (int exp = 2; value < 100_000_000_000_000L; exp++) {
                value *= base;
                if (sumOfDigits(value) == base) {
                    resultSet.add(value);
                }
            }
        }

        return resultSet.stream().skip(n - 1).findFirst().orElse(-1L);
    }

    private static int sumOfDigits(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}