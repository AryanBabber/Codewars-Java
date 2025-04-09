import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

        String[] wordArray = words.split(" ");
        Pattern pattern = Pattern.compile("\\d+");

        Arrays.sort(wordArray, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                Matcher matcherA = pattern.matcher(a);
                Matcher matcherB = pattern.matcher(b);

                int numA = matcherA.find() ? Integer.parseInt(matcherA.group()) : 0;
                int numB = matcherB.find() ? Integer.parseInt(matcherB.group()) : 0;

                return Integer.compare(numA, numB);
            }
        });

        return String.join(" ", wordArray);
    }
}