import java.util.*;

public class Representation {
    public static int daysRepresented(int[][] trips) {
        Set<Integer> uniqueDays = new HashSet<>();

        for (int[] trip : trips) {
            for (int day = trip[0]; day <= trip[1]; day++) {
                uniqueDays.add(day);
            }
        }

        return uniqueDays.size();
    }
}