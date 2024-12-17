import java.util.*;

public class Kata {
  public static int scrabbleScore(String word) {
    Map<Character, Integer> map = new HashMap<>();
    addCharacters(map, "AEIOULNRST", 1);
    addCharacters(map, "DG", 2);
    addCharacters(map, "BCMP", 3);
    addCharacters(map, "FHVWY", 4);
    addCharacters(map, "K", 5);
    addCharacters(map, "JX", 8);
    addCharacters(map, "QZ", 10);

    int score = 0;
    for (char c : word.toUpperCase().toCharArray()) {
      score += map.getOrDefault(c, 0);
    }

    return score;
  }

  private static void addCharacters(Map<Character, Integer> map, String key, int value) {
    for (char c : key.toCharArray()) {
      map.put(c, value);
    }
  }
}