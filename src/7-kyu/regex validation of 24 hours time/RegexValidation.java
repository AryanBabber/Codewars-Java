public class RegexValidation {

    public static boolean validateTime(String time) {
        String[] arr = time.split(":");

        if (arr.length != 2)
            return false;
        try {
            int hours = Integer.parseInt(arr[0]);
            int minutes = Integer.parseInt(arr[1]);
            if (hours > 23 || minutes > 59) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return time.matches("\\d{1,2}:\\d{2}");
    }
}