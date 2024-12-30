public class WithoutLetterE {
  public static String findE(String str) {
    if (str == null)
      return null;
    if (str.length() == 0)
      return "";
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.toLowerCase().charAt(i) == 'e') {
        count++;
      }
    }

    return count == 0 ? "There is no \"e\"." : Integer.toString(count);
  }
}
