public class Kata {
    public static int findNextPower(int val, int pow_) {
        double root = Math.pow(val, (1.0 / pow_));
        int next = (int) Math.floor(root) + 1;
        return (int) Math.pow(next, pow_);
    }

    public static void main(String[] args) {
        System.out.println(findNextPower(12385, 3));
    }
}
