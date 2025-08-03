import java.util.Date;

public class Day {

    public String countDays(Date date) {
        Date today = new Date();

        if (date.equals(today)) {
            return "Today is the day!";
        }

        if (today.after(date)) {
            return "The day is in the past!";
        }

        long diff = date.getTime() - today.getTime();
        long days = diff / (24 * 60 * 60 * 1000);
        return Math.round(days) + " days";
    }

}