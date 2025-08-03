
import java.util.Arrays;

public class Greed {
  public static int greedy(int[] dice) {
    int result = 0;
    int[] counts = new int[6];

    Arrays.sort(dice);
    for (int num : dice)
      counts[num - 1]++;

    if (counts[0] >= 3) {
      result += 1000;
      counts[0] -= 3;
    }
    result += counts[0] * 100;

    if (counts[4] >= 3) {
      result += 500;
      counts[4] -= 3;
    }
    result += counts[4] * 50;

    result += (counts[1] / 3) * 200;
    result += (counts[2] / 3) * 300;
    result += (counts[3] / 3) * 400;
    result += (counts[5] / 3) * 600;

    return result;
  }
}