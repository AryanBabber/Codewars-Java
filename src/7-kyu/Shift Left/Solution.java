public class Solution {
  public static int shiftLeft(String a, String b) {
    int s = a.length() - 1;
    int t = b.length() - 1;

    while (s >= 0 && t >= 0 && a.charAt(s) == b.charAt(t)) {
      s--;
      t--;
    }

    return s + t + 2;
  }

}