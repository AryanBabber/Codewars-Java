public class Dinglemouse {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        return new int[] { getAge(catYears, 4), getAge(dogYears, 5) };
    }

    private static int getAge(int years, int x) {
        return years < 15 ? 0 : years < 24 ? 1 : (int) Math.ceil(2 + (years - 24) / x);
    }

}