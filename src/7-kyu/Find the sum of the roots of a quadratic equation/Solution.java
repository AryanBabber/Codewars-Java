import java.util.OptionalDouble;

public class Solution {
    public static OptionalDouble roots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return OptionalDouble.empty();
        }
        double rootSum = -b / a;
        return OptionalDouble.of(Math.round(rootSum * 100.0) / 100.0);
    }

    public static void main(String[] args) {
        System.out.println(roots(3,11,6));
    }
}