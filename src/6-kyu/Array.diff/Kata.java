
import java.util.*;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        Set<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        return Arrays.stream(a)
                .filter(num -> !setB.contains(num))
                .toArray();
    }
}