import java.util.*;

public class Solution {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s3; i += Math.max(s1, s2)) {
            if (i % s1 == 0 && i % s2 == 0)
                arr.add(i);
        }

        return arr.subList(1, arr.size());
    }

    public static void main(String[] args) {
        System.out.println(findMultiples(5, 13, 800));
        System.out.println(findMultiples(2, 4, 40));
        System.out.println(findMultiples(7, 16, 800));
    }
}