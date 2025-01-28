import java.util.*;

public class Kata {
    public static String highAndLow(String numbers) {
        int[] nums = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);

        return nums[nums.length - 1] + " " + nums[0];
    }
}