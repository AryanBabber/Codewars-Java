import java.util.stream.IntStream;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        return IntStream.iterate(1, c -> c + 1).limit(n).toArray();
    }
}