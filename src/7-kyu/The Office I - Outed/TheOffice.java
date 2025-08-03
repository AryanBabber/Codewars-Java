class Person {
    @SuppressWarnings("unused")
    final String name = null;
    @SuppressWarnings("unused")
    final int happiness = 0;
}

public class TheOffice {
    public static String outed(Person[] meet, String boss) {
        int sum = 0;
        int cnt = 0;

        for (Person p : meet) {
            if (!p.name.equals(boss)) {
                sum += p.happiness;
            } else {
                sum += p.happiness * 2;
            }
            cnt++;
        }

        return (double) sum / cnt <= 5.0 ? "Get Out Now!" : "Nice Work Champ!";
    }
}
