
import java.util.Arrays;

class Solution {
    public static String solve(String a, String b) {
        String s1 = String.join("", Arrays.stream(a.split("")).filter(c -> !b.contains(c)).toArray(String[]::new));
        String s2 = String.join("", Arrays.stream(b.split("")).filter(c -> !a.contains(c)).toArray(String[]::new));

        return s1 + s2;
    }
}