public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                sb.append("(");
            } else {
                sb.append(")");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("(( @"));
    }
}
