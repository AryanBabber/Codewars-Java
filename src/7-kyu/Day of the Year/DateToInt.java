public class DateToInt {
    public static int toDayOfYear(int[] date) {
        int days = date[0];

        for (int i = 0; i < date[1]; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> days += 31;
                case 2 -> {
                    if (isLeap(date[2])) {
                        days += 29;
                    }

                    else
                        days += 28;
                }
                case 4, 6, 9, 11 -> days += 30;
                default -> days += 0;
            }
        }

        return days;
    }

    private static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }

        return false;
    }
}