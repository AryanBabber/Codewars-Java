public class Kata {
    public static String getMiddle(String word) {
      if(word.length() < 3) return word;

      return getMiddle(word.substring(1, word.length() - 1));
    }

    public static void main(String[] args) {
      System.out.println(getMiddle("testing"));
    }
  }