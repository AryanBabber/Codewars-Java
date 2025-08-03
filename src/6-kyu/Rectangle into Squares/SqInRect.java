import java.util.*;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        List<Integer> arr = new ArrayList<>();

        if (lng == wdth) {
            return null;
        }

        while (lng > 0 && wdth > 0) {
            arr.add(Math.min(lng, wdth));
            if (lng > wdth) {
                lng -= wdth;
            } else {
                wdth -= lng;
            }
        }

        return arr;
    }
}
