import java.text.*;
import java.util.*;

public class DateDays {

    public static String dateNbDays(double a0, double a, double p) {
        int count = 1;

        while (a0 < a) {
            count++;
            a0 += a0 * (p / 100 / 360);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.JANUARY, 1);

        calendar.add(Calendar.DAY_OF_YEAR, count - 1);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(calendar.getTime());
    }
}