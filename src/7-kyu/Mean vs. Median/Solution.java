
import java.util.Arrays;

public class Solution {

  public static String meanVsMedian(int[] numbers) {
    Arrays.sort(numbers);

    double mean = Arrays.stream(numbers).average().orElse(0);

    double median;
    int n = numbers.length;
    if (n % 2 == 0) {
      median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
    } else {
      median = numbers[n / 2];
    }

    if (mean == median) {
      return "same";
    } else if (mean > median) {
      return "mean";
    } else {
      return "median";
    }
  }
}