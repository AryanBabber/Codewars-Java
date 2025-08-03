public class DivisibleNb {
	public static boolean isDivisible(long n, long x, long y) {
		return n % y == 0 && n % x == 0;
	}
}