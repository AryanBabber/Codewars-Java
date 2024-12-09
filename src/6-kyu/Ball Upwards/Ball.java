public class Ball {
    public static int maxBall(int v0) {
        double v = (v0 * 10000.0) / 3600;
        return (int) Math.round(v / 9.81);
    }
}