public class Dinglemouse {

    public static String whatTimeIsIt(final double angle) {
        int hour = (int) Math.floor(angle / 30);
        if (hour == 0)
            hour = 12;

        int minutes = (int) Math.floor((angle % 30) * 2);

        return String.format("%02d:%02d", hour, minutes);
    }

}