
import java.util.*;

class sorter {

    public static List<String> sort(List<String> textbooks) {
      //Cramming right before a test can't be that bad?
      Collections.sort(textbooks, (a,b) -> a.toLowerCase().compareTo(b.toLowerCase()));
      return textbooks;
    }

    public static void main(String[] args) {
        ArrayList<String> textbooks = new ArrayList<>(Arrays.asList("Algebra", "History", "Geometry", "english"));
        System.out.println(sort(textbooks));
    }
  }