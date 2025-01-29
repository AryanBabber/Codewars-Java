
import java.util.HashMap;
import java.util.Map;

public class BatmanQuotes {

    public static String getQuote(String[] quotes, String hero) {
        Map<Character, String> heroMap = new HashMap<>();
        heroMap.put('R', "Robin");
        heroMap.put('J', "Joker");
        heroMap.put('B', "Batman");

        char heroInitial = hero.charAt(0);
        String number = hero.replaceAll("\\D", ""); // Removes non-digits
        int index = Integer.parseInt(number);

        return heroMap.get(heroInitial) + ": " + quotes[index];
    }
}
