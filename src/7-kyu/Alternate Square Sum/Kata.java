public class Kata {
    public static int alternateSqSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], i % 2 == 1 ? 2 : 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateSqSum(new int[] {11,12,13,14,15}));
    }
}