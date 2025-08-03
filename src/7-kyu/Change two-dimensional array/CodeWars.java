public class CodeWars {
  public static int[][] matrix(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      array[i][i] = array[i][i] < 0 ? 0 : 1;
    }

    return array;
  }
}