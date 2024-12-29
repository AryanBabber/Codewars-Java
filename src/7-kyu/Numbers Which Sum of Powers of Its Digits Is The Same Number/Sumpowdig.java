import java.util.*;

public class Sumpowdig {

    public static long[] eqSumPowDig(long hMax, int exp) {
        // your code
        List<Long> result = new ArrayList<>();
        for (int num = 2; num <= hMax; num++) {
            int sum = 0, temp = num;
            while (temp > 0) {
                sum += Math.pow(temp % 10, exp);
                temp /= 10;
            }
            if (sum == num)
                result.add((long) num);
        }
        return result.stream().mapToLong(Long::longValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(eqSumPowDig(1000, 3)));
    }
}