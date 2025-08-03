public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
    int idx = str.indexOf(c);
    int second = -1;
    if (idx != -1) {
      second = str.indexOf(c, idx + 1);
    }

    return second;
  }
}