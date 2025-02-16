public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        String[][] result = new String[skinScan.length][skinScan[0].length];

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                result[i][j] = skinScan[i][j].replace("X", "*");
            }
        }
        return result;
    }
}
