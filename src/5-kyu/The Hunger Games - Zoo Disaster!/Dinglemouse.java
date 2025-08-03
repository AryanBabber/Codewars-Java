import java.util.*;

public class Dinglemouse {

    private static final Map<String, Set<String>> animals = new HashMap<>();

    static {
        animals.put("antelope", Collections.singleton("grass"));
        animals.put("big-fish", Collections.singleton("little-fish"));
        animals.put("bug", Collections.singleton("leaves"));
        animals.put("bear",
                new HashSet<>(Arrays.asList("big-fish",
                        "bug",
                        "chicken",
                        "cow",
                        "leaves",
                        "sheep")));
        animals.put("chicken", Collections.singleton("bug"));
        animals.put("cow", Collections.singleton("grass"));
        animals.put("fox", new HashSet<>(Arrays.asList("chicken", "sheep")));
        animals.put("giraffe", Collections.singleton("leaves"));
        animals.put("lion", new HashSet<>(Arrays.asList("antelope", "cow")));
        animals.put("panda", Collections.singleton("leaves"));
        animals.put("sheep", Collections.singleton("grass"));
    }

    public static String[] whoEatsWho(final String zoo) {
        final List<String> whoAteWhom = new LinkedList<>();
        final List<String> things = new ArrayList<>(Arrays.asList(zoo.split(",")));

        while (oneRound(whoAteWhom, things)) {
        }

        List<String> result = new LinkedList<>();
        result.add(zoo);
        result.addAll(whoAteWhom);
        result.add(String.join(",", things));
        return result.toArray(new String[0]);
    }

    private static boolean oneRound(List<String> whoAteWhom, List<String> things) {
        for (int i = 0; i < things.size(); i++) {
            if (canEatLeft(things, i)) {
                eatLeft(whoAteWhom, things, i);
                return true;
            } else if (canEatRight(things, i)) {
                eatRight(whoAteWhom, things, i);
                return true;
            }
        }
        return false;
    }

    private static void eatRight(List<String> whoAteWhom, List<String> things, int i) {
        eat(whoAteWhom, things, i, i + 1);
    }

    private static void eatLeft(List<String> whoAteWhom, List<String> things, int i) {
        eat(whoAteWhom, things, i, i - 1);
    }

    private static void eat(List<String> whoAteWhom, List<String> things, int who, int whom) {
        whoAteWhom.add(String.format("%s eats %s", things.get(who), things.get(whom)));
        things.remove(whom);
    }

    private static boolean canEatRight(List<String> things, int i) {
        final Set<String> lunches = animals.get(things.get(i));
        return i < things.size() - 1 && lunches != null && lunches.contains(things.get(i + 1));
    }

    private static boolean canEatLeft(List<String> things, int i) {
        final Set<String> lunches = animals.get(things.get(i));
        return i > 0 && lunches != null && lunches.contains(things.get(i - 1));
    }

}