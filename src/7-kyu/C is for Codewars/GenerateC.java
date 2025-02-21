public class GenerateC {
    public static String generateC(int size) {
        String[] Cs = new String[size * 5];
        int i;
        for(i = 0; i < size; i++) {
            Cs[i] = "C".repeat(size * 5);
        }

        for (; i < Cs.length - size ; i++) {
            Cs[i] = "C".repeat(size);
        }

        for(; i < Cs.length; i++) {
            Cs[i] = "C".repeat(size * 5);
        }

        return String.join("\n", Cs);
    }
}