import java.util.*;

public class BattleShips {

    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        Map<Integer, Integer> boatSizes = new HashMap<>();
        Map<Integer, Integer> boatHits = new HashMap<>();

        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int boat = board[r][c];
                if (boat > 0) {
                    boatSizes.put(boat, boatSizes.getOrDefault(boat, 0) + 1);
                }
            }
        }

        for (int[] attack : attacks) {
            int x = attack[0] - 1;
            int y = rows - attack[1];

            if (x >= 0 && x < cols && y >= 0 && y < rows) {
                int boat = board[y][x];
                if (boat > 0) {
                    boatHits.put(boat, boatHits.getOrDefault(boat, 0) + 1);
                }
            }
        }

        int sunk = 0, damaged = 0, notTouched = 0;
        double points = 0.0;

        for (int boat : boatSizes.keySet()) {
            int size = boatSizes.get(boat);
            int hits = boatHits.getOrDefault(boat, 0);

            if (hits == size) {
                sunk++;
                points += 1;
            } else if (hits > 0) {
                damaged++;
                points += 0.5;
            } else {
                notTouched++;
                points -= 1;
            }
        }

        Map<String, Double> result = new HashMap<>();
        result.put("sunk", (double) sunk);
        result.put("damaged", (double) damaged);
        result.put("notTouched", (double) notTouched);
        result.put("points", points);

        return result;
    }
}