public class Kata {
    public static int pointsNumber(int radius) {
        int count = 0;
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                if (x * x + y * y <= radius * radius) {
                    count++;
                }
            }
        }

        return count;
    }
}