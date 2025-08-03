
import java.util.Arrays;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty())
            return null;

        return String.join(" ", Arrays.stream(phrase.split(" "))
                .map(c -> c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase()).toArray(String[]::new));
    }
}