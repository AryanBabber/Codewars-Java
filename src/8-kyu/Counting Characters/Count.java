import java.util.*;

interface Count {
    static int countCharOccurrences(String s, char c) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        if (!map.containsKey(c))
            return 0;

        return map.get(c);
    }
}
