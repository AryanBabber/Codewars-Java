
import java.util.Arrays;

public class Solution {
    public static int minimumNumber(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        int count = 0;
        
        while(!isPrime(sum)) {
            count++;
            sum++;
        }

        return count;
    }

    private static boolean isPrime(int n) {
        if(n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(new int[] {2, 12, 8, 4, 6}));
    }
}