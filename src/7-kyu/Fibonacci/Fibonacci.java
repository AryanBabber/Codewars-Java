

public class Fibonacci {
    public static long fib(int n) {
        if (n < 3)
            return 1;

        long[] series = new long[n];
        series[0] = 1;
        series[1] = 1;

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series[n-1];
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
