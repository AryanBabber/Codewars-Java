public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int counter = 0;

        for (int i = start; i <= end; i++) {
            if (Integer.toString(i).contains("5"))
                continue;

            counter++;
        }

        return counter;
    }
}