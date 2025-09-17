public class Sieve {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();


        // Sieve: true means prime, false means not prime
        boolean[] numbers = new boolean[n+1];
        for (int i = 0; i <= n; i++) {
            numbers[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (numbers[p]) {
                // Mark all multiples of p as not prime
                for (int i = p * p; i <= n; i += p) {
                    numbers[i] = false;
                }
            }
        }

        // Find next prime (and print)
        System.out.println("Primes up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (numbers[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
}
