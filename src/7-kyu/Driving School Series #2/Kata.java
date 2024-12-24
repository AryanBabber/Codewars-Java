public class Kata {
    public static int cost(int mins) {
        int baseCost = 30;
        int additionalCost = (mins > 65) ? (int) Math.ceil((mins - 65) / 30.0) * 10 : 0;

        return baseCost + additionalCost;
    }
}