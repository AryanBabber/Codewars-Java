import java.util.*;

public class Valley {

    public static int[] makeValley(int[] arr) {
        Arrays.sort(arr);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i -= 2) {
            left.add(arr[i]);
            if (i - 1 >= 0) {
                right.add(arr[i - 1]);
            }
        }

        Collections.reverse(right);

        left.addAll(right);

        return left.stream().mapToInt(Integer::intValue).toArray();
    }
}