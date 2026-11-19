public class Primes {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");
        int count = 0;
        for (int n = 0; n <= 500; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println("\nTotal: " + count);
    }
}
