
import java.util.*;

public class Trigrams {
	public static String trigrams(String phrase) {
		List<String> arr = new ArrayList<>();

		for (int i = 0; i < phrase.length() - 2; i++) {
			arr.add(phrase.substring(i, i + 3).replace(" ", "_"));
		}

		return String.join(" ", arr);
	}
}
