
public class Kata {
    public static char[] moreZeros(String s) {
        if (s == null || s.isEmpty())
            return new char[0];

        return s.chars()
                .filter(c -> {
                    String binary = Integer.toBinaryString(c);
                    long zeroCount = binary.chars().filter(ch -> ch == '0').count();
                    long oneCount = binary.chars().filter(ch -> ch == '1').count();
                    return zeroCount > oneCount;
                })
                .distinct()
                .mapToObj(c -> (char) c)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString()
                .toCharArray();
    }
}