import java.util.*;

class Solution {
    public static char solve(String s) {
        int[] firstIndex = new int[256];
        int[] lastIndex = new int[256];
        Arrays.fill(firstIndex, -1);

        char result = '\0';
        int maxDistance = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (firstIndex[c] == -1) {
                firstIndex[c] = i;
            }
            lastIndex[c] = i;
        }

        for (int i = 0; i < 256; i++) {
            if (firstIndex[i] != -1) {
                int distance = lastIndex[i] - firstIndex[i];
                if (distance > maxDistance || (distance == maxDistance && i < result)) {
                    maxDistance = distance;
                    result = (char) i;
                }
            }
        }

        return result;
    }
}