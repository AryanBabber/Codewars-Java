import java.util.*;

public class Kata {
    public static boolean isNice(Integer[] arr) {
        if(arr.length == 0 || arr == null) return false;
        Set<Integer> set = new HashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        for (int n : arr) {
            if (!set.contains(n - 1) && !set.contains(n + 1))
                return false;
        }

        return true;
    }
}