
public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // testing for random numbers
    public static void main(String[] args) {
        System.out.println(isPrime(79));
        System.out.println(isPrime(7));
        System.out.println(isPrime(217));
        System.out.println(isPrime(21797));
    }
}
