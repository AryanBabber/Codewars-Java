import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String rpsls(String player1, String player2) {
        if (player1.equals(player2))
            return "Draw!";

        Map<String, String[]> map = new HashMap<>();
        map.put("rock", new String[] { "scissors", "lizard" });
        map.put("paper", new String[] { "rock", "spock" });
        map.put("scissors", new String[] { "paper", "lizard" });
        map.put("lizard", new String[] { "spock", "paper" });
        map.put("spock", new String[] { "rock", "scissors" });

        if (player2.equals(map.get(player1)[0]) || player2.equals(map.get(player1)[1])) {
            return "Player 1 Won!";
        }

        return "Player 2 Won!";
    }

    public static void main(String[] args) {
        rpsls("rock", "lizard");
    }
}