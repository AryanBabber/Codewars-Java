import java.util.*;

public class DecodeResistorColors {
    private static final Map<String, Integer> map = new HashMap<>();

    static {
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("gray", 8);
        map.put("white", 9);
    }

    public static String decodeResistorColors(String bands) {
        String[] b1 = bands.split(" ");
        int resistance = (10 * map.get(b1[0]) + map.get(b1[1]))
                * (int) Math.pow(10, map.get(b1[2]));
        String tolerance = b1.length < 4 ? "20%"
                : b1[3].equals("gold") ? "5%" : "10%";

        String resistanceStr;
        if (resistance < 1000) {
            resistanceStr = String.valueOf(resistance);
        } else if (resistance < 1000000) {
            resistanceStr = String.format("%.1fk", resistance / 1000.0);
            if (resistanceStr.endsWith(".0k")) {
                resistanceStr = resistanceStr.replace(".0k", "k");
            }
        } else {
            resistanceStr = String.format("%.1fM", resistance / 1000000.0);
            if (resistanceStr.endsWith(".0M")) {
                resistanceStr = resistanceStr.replace(".0M", "M");
            }
        }

        return resistanceStr + " ohms, " + tolerance;
    }
}