
public class Kata {
    private static final String[] animals;
    private static final String[] elements;

    static {
        animals = new String[] {
                "Rat",
                "Ox",
                "Tiger",
                "Rabbit",
                "Dragon",
                "Snake",
                "Horse",
                "Goat",
                "Monkey",
                "Rooster",
                "Dog",
                "Pig"
        };

        elements = new String[] {
                "Wood", "Fire", "Earth", "Metal", "Water"
        };
    }

    public static String chineseZodiac(int year) {
        int start = 1924;
        int curr = year - start;
        String animal = animals[curr % 12];
        String element = elements[(curr / 2) % 5];

        return "%s %s".formatted(element, animal);
    }

    public static void main(String[] args) {
        System.out.println(chineseZodiac(2025));
    }
}