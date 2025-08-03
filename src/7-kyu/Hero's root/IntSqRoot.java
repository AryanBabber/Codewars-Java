public class IntSqRoot {
    public static long IntRac(long n, long guess) {
        long count = 1;
        long x = guess;
        long nextX = (x + n / x) / 2;

        while (x != nextX) {
            x = nextX;
            nextX = (x + n / x) / 2;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(IntRac(25, 1));
    }
}