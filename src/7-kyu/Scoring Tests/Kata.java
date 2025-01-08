
import java.util.Arrays;

public class Kata {
    public static int sol(int[] arr, int r, int o, int w) {
        int zeroes = (int) Arrays.stream(arr).filter(c -> c == 0).count();
        int ones = (int) Arrays.stream(arr).filter(c -> c == 1).count();
        int twos = (int) Arrays.stream(arr).filter(c -> c == 2).count();

        return (zeroes * r) + (ones * o) - (twos * w);
    }
}