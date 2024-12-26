import java.util.*;

public class Strange {
    public static int mathematics(int n, int k) {
        List<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(String.valueOf(i));
        }

        arr.sort(Comparator.naturalOrder());

        return arr.indexOf(String.valueOf(k)) + 1;
    }
}