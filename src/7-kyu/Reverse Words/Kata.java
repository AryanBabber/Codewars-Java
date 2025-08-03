/*

Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"

*/

public class Kata {
    public static String reverseWords(final String original) {
        if (original == null || original.isEmpty()) {
            return original;
        }

        StringBuilder reversed = new StringBuilder();
        String[] words = original.split("(?<=\\s)|(?=\\s)"); // Split while retaining spaces

        for (String word : words) {
            if (!word.trim().isEmpty()) {
                reversed.append(new StringBuilder(word).reverse());
            } else {
                reversed.append(word); // Retain spaces
            }
        }

        return reversed.toString();
    }

}