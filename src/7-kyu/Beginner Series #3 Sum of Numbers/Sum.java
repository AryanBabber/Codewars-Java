public class Sum {
    public int GetSum(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        return ((max - min + 1) * (max + min)) / 2;
    }
}