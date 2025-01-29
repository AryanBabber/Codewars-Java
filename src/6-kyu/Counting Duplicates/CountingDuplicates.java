import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    Map<Character, Integer> map = new HashMap<>();
    text = text.toLowerCase();
    for (char c : text.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int dupes = 0;

    for (int el : map.values()) {
      if (el > 1)
        dupes++;
    }

    return dupes;
  }
}
