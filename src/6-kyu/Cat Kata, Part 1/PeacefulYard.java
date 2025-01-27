import java.util.*;

public class PeacefulYard {
    public static boolean peacefulYard(String[] yd, int d) {
        List<int[]> pos = new ArrayList<>();

        for (int i = 0; i < yd.length; i++) {
            for (int j = 0; j < yd[i].length(); j++) {
                if (yd[i].charAt(j) != '-') {
                    pos.add(new int[] { i, j });
                }
            }
        }

        int dSquared = d * d;
        for (int i = 0; i < pos.size(); i++) {
            for (int j = i + 1; j < pos.size(); j++) {
                int dx = pos.get(i)[0] - pos.get(j)[0];
                int dy = pos.get(i)[1] - pos.get(j)[1];
                if (dx * dx + dy * dy < dSquared) {
                    return false;
                }
            }
        }

        return true;
    }
}
