
import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        int[] evens = Arrays.stream(integers).filter(c -> c % 2 == 0).toArray();
        int[] odds = Arrays.stream(integers).filter(c -> c % 2 != 0).toArray();

        return evens.length == 1 ? evens[0] : odds[0];
    }
}