
import java.util.Arrays;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] nums = new int[Math.abs(n) + 1];

        for (int i = 1; i <= Math.abs(n); i++) {
            
            if(n < 0) {
                nums[i] = nums[i-1] - i;
            } else {
                nums[i] = nums[i-1] + i;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(5)));
        System.out.println(Arrays.toString(sumOfN(-5)));
    }
}