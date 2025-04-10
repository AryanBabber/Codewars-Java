public class LuckyNumber {
  public static boolean isLucky(long n) {
    long ans = 0;

    while (n > 0) {
      ans += n % 10;
      n /= 10;
    }

    return ans % 9 == 0;
  }
}