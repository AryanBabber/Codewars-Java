
import java.util.Arrays;

public class Positive {
  public static int sum(int[] arr) {
    return Arrays.stream(arr).filter(c -> c > 0).sum();
  }
}