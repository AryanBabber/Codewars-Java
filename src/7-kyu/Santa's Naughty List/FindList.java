import java.util.List;

public class FindList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return santasList.stream().filter(c -> children.contains(c)).distinct().sorted().toList();
    }

    public static void main(String[] args) {
        List<String> santasList = List.of("Jordan", "Jackson", "Jason", "Johnny", "Jordan");
        List<String> children = List.of("Jordan", "Jason", "Jennifer");

        System.out.println(findChildren(santasList, children));
    }
}