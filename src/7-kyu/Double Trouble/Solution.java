
import java.util.*;

public class Solution {
    public static int[] trouble(int[] x, int t) {
        List<Integer> li = new ArrayList<>();

        for (int value : x) {
            li.add(value);
        }

        for (int i = 0; i < li.size() - 1; i++) {
            if (li.get(i) + li.get(i + 1) == t) {
                li.remove(i + 1);
                i--;
            }
        }

        return li.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(trouble(new int[] { 1, 2, 3, 4, 5, 6 }, 11)));
    }
}