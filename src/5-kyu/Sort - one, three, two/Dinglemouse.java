import java.util.*;

public class Dinglemouse {
    private static final String[] ONES = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static final String[] TEENS = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen" };
    private static final String[] TENS = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
            "ninety" };

    public static int[] sort(final int array[]) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        List<NumberName> numberNames = new ArrayList<>();
        for (int number : array) {
            numberNames.add(new NumberName(number, numberToWords(number)));
        }

        numberNames.sort(Comparator.comparing(n -> n.name));

        int[] sortedNumbers = new int[numberNames.size()];
        for (int i = 0; i < numberNames.size(); i++) {
            sortedNumbers[i] = numberNames.get(i).number;
        }

        return sortedNumbers;
    }

    private static String numberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            words.append(ONES[number / 100]).append(" hundred");
            number %= 100;
            if (number > 0) {
                words.append(" and ");
            }
        }

        if (number >= 20) {
            words.append(TENS[number / 10]);
            number %= 10;
            if (number > 0) {
                words.append(" ");
            }
        } else if (number >= 10) {
            words.append(TEENS[number - 10]);
            number = 0;
        }

        if (number > 0) {
            words.append(ONES[number]);
        }

        return words.toString().trim();
    }

    private static class NumberName {
        int number;
        String name;

        NumberName(int number, String name) {
            this.number = number;
            this.name = name;
        }
    }
}