
import java.util.*;

public class Kata {
  public static Double[] sortItOut(Double[] arr) {
    Double[] odds = Arrays.stream(arr)
        .filter(n -> Math.floor(n) % 2 != 0)
        .sorted()
        .toArray(Double[]::new);

    Double[] evens = Arrays.stream(arr)
        .filter(n -> Math.floor(n) % 2 == 0)
        .sorted(Comparator.reverseOrder())
        .toArray(Double[]::new);

    Double[] result = new Double[arr.length];
    System.arraycopy(odds, 0, result, 0, odds.length);
    System.arraycopy(evens, 0, result, odds.length, evens.length);

    return result;
  }
}