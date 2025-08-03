import java.util.Arrays;
// import java.util.stream.*;

public class BitWars {
	public static String bitsWar(int[] numbers) {
		int oddScore = Arrays.stream(numbers)
				.filter(v -> v % 2 != 0)
				.map(v -> {
					int bitCount = Integer.bitCount(Math.abs(v));
					return v < 0 ? -bitCount : bitCount;
				})
				.sum();

		int evenScore = Arrays.stream(numbers)
				.filter(v -> v % 2 == 0)
				.map(v -> {
					int bitCount = Integer.bitCount(Math.abs(v));
					return v < 0 ? -bitCount : bitCount;
				})
				.sum();

		if (oddScore > evenScore) {
			return "odds win";
		} else if (oddScore == evenScore) {
			return "tie";
		} else {
			return "evens win";
		}
	}

}