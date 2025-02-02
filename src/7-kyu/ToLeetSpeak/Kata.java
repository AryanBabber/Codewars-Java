import java.util.HashMap;
import java.util.Map;

class Kata {
    private static final Map<Character, Character> map = new HashMap<>();

    static {
        map.put('A', '@');
        map.put('B', '8');
        map.put('C', '(');
        map.put('D', 'D');
        map.put('E', '3');
        map.put('F', 'F');
        map.put('G', '6');
        map.put('H', '#');
        map.put('I', '!');
        map.put('J', 'J');
        map.put('K', 'K');
        map.put('L', '1');
        map.put('M', 'M');
        map.put('N', 'N');
        map.put('O', '0');
        map.put('P', 'P');
        map.put('Q', 'Q');
        map.put('R', 'R');
        map.put('S', '$');
        map.put('T', '7');
        map.put('U', 'U');
        map.put('V', 'V');
        map.put('W', 'W');
        map.put('X', 'X');
        map.put('Y', 'Y');
        map.put('Z', '2');
    }

    static String toLeetSpeak(final String speak) {
        String ans = "";
        for (char c : speak.toCharArray()) {
            ans += map.getOrDefault(Character.toUpperCase(c), c);
        }

        return ans;
    }
}