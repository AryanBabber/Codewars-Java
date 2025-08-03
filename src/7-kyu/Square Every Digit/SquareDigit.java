
import java.util.Arrays;

public class SquareDigit {
  public int squareDigits(int n) {
    return Integer.parseInt(
        String.join(
            "", Arrays.stream(
                Integer.toString(n).split(""))
                .map(v -> Integer.toString(Integer.parseInt(v) * Integer.parseInt(v)))
                .toArray(String[]::new)));
  }
}