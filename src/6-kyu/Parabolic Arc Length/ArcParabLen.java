public class ArcParabLen {
  private static double f(double x) {
    return x * x;
  }

  public static double lenCurve(int n) {
    double res = 0;
    double h = 1.0 / n;

    for (double i = 0; i < 1; i += h) {
      res += Math.sqrt(Math.pow(h, 2) + Math.pow(f(i) - f(i + h), 2));
      n -= 1;
      if (n == 0)
        break;
    }

    return Math.round(res * 1e9) / 1e9;
  }
}