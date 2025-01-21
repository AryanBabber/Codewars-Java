public class BitsBattle {
  static String bitsBattle(int[] numbers) {
    int oddsOnes = 0;
    int evensZeroes = 0;

    for (int num : numbers) {
      if (num == 0)
        continue;
      String bin = Integer.toBinaryString(num);
      if (num % 2 == 0) {
        evensZeroes += bin.replaceAll("1", "").length();
      } else {
        oddsOnes += bin.replaceAll("0", "").length();
      }
    }

    return oddsOnes > evensZeroes ? "odds win" : evensZeroes > oddsOnes ? "evens win" : "tie";
  }

  public static void main(String[] args) {
    System.out.println(bitsBattle(new int[] { 0 }));
  }
}