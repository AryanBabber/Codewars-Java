public class Divisible {
    public static boolean isDivisible(int... otherN) {
        int first = otherN[0];
        for (int i = 1; i < otherN.length; i++) {
            if (first % otherN[i] != 0)
                return false;
        }
        return true;
    }
}
