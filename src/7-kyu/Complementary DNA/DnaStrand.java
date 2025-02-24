public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();

        for(char c : dna.toCharArray()) {
            switch(c) {
                case 'A' -> sb.append('T');
                case 'T' -> sb.append('A');
                case 'C' -> sb.append('G');
                case 'G' -> sb.append('C');
            }
        }

        return sb.toString();
    }
}