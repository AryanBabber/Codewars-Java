import java.util.*;

public class BingoOrNot {
    public static String bingo(int[] numberArray) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : numberArray) {
            if (num == 2 || num == 7 || num == 9 || num == 14 || num == 15) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
        }

        return map.size() == 5 ? "WIN" : "LOSE";
    }

    public static void main(String[] args) {
        System.out.println(bingo(new int[] { 23, 14, 7, 21, 15, 9, 15, 26, 27, 14 }));
        System.out.println(bingo(new int[] { 21, 13, 2, 7, 5, 14, 7, 15, 9, 10 }));

    }
}
