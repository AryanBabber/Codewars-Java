
import java.util.ArrayList;
import java.util.List;

public class Kata {
    private static int sumOfFactors(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                li.add(i);
        }

        return li.stream().mapToInt(Integer::intValue).sum();
    }

    public static boolean abundantNumber(int num) {
        // Your code goes here
        return sumOfFactors(num) >= num;
    }

}