import java.util.*;

public class KPrimes {

    public static long countPrimeFactors(long num) {
        long count = 0;
        long factor = 2;

        while (factor * factor <= num) {
            while (num % factor == 0) {
                count++;
                num /= factor;
            }
            factor++;
        }
        if (num > 1)
            count++;

        return count;
    }

    public static long[] countKprimes(int k, long start, long end) {
        List<Long> kPrimes = new ArrayList<>();

        for (long i = start; i <= end; i++) {
            if (countPrimeFactors(i) == k) {
                kPrimes.add((long) i);
            }
        }

        return kPrimes.stream().mapToLong(Long::longValue).toArray();
    }

    public static int puzzle(int s) {
        long[] onePrimes = countKprimes(1, 2, s);
        long[] threePrimes = countKprimes(3, 2, s);
        long[] sevenPrimes = countKprimes(7, 2, s);

        Set<Long> sevenPrimeSet = new HashSet<>();
        for (long num : sevenPrimes) {
            sevenPrimeSet.add(num);
        }

        int count = 0;

        for (long a : onePrimes) {
            for (long b : threePrimes) {
                long c = s - (a + b);
                if (sevenPrimeSet.contains(c)) {
                    count++;
                }
            }
        }

        return count;
    }

}