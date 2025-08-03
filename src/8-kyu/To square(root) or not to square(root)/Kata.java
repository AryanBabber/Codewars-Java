
import java.util.Arrays;

public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(v -> {
                    int root = (int) Math.sqrt(v);
                    return (root * root == v) ? root : v * v;
                })
                .toArray();
    }
}