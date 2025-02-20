
import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).map(c -> c.length()).min(Comparator.naturalOrder()).get();
    }
}