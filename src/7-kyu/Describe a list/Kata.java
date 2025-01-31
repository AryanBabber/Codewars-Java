import java.util.*;

public class Kata {
    public static String describeList(final List list) {
        return list.isEmpty() ? "empty" : list.size() == 1 ? "singleton" : "longer";
    }
}