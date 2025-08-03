
import java.util.*;

public class Kata {
    public static String paul(String[] x) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kata", 5);
        map.put("Petes kata", 10);
        map.put("life", 0);
        map.put("eating", 1);

        int score = 0;

        for (String str : x) {
            score += map.get(str);
        }

        if (score < 40)
            return "Super happy!";
        else if (score < 70)
            return "Happy!";
        else if (score < 100)
            return "Sad!";
        else
            return "Miserable!";
    }
}