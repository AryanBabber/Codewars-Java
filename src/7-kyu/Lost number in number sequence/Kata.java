
import java.util.Arrays;

public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return Arrays.stream(arr).sum() - Arrays.stream(mixedArr).sum();
    }
}