public class Kata {

  public static String womensAge(int n) {
    return "%d? That's just %d, in base %d!".formatted(n, 20 + n % 2, (int) Math.floor(n / 2));
  }
}