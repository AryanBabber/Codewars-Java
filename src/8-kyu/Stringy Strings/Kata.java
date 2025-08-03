public class Kata {
  public static String stringy(int size) {
    if (size % 2 == 1) {
      return "10".repeat(size / 2) + "1";
    }
    return "10".repeat(size / 2);
  }
}