//twin prime number less than 100
public class TwinPrimeNumber {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 2; i < 100; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}