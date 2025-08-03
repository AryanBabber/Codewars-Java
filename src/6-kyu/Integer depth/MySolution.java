import java.util.*;

public class MySolution {

    public int computeDepth(int n) {
        Set<Integer> set = new HashSet<>();
        int nums = 1;
        int depth = 0;

        while (set.size() != 10) {
            addNums(set, n * nums++);
            depth++;
        }

        return depth;
    }

    private void addNums(Set<Integer> set, int n) {
        while (n != 0) {
            int d = n % 10;
            set.add(d);
            n /= 10;
        }
    }
}