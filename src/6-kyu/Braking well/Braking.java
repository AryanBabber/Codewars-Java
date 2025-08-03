public class Braking {
    private static final double G = 9.81;

    public static double dist(double v, double mu) {
        double u = (v * 5) / 18;
        return (u * u) / (2 * mu * G) + u;
    }

    public static double speed(double d, double mu) {
        double b = -2 * mu * G;
        return (3.6 * (b + Math.sqrt(b * b - 4 * b * d))) / 2;
    }
}