import java.util.Scanner;

public class Prime {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // 0, 1, and negative numbers are not prime
        if (n <= 1) {
            return false;
        }

        // Check for factors from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // If n is divisible by any number other than 1 and itself, it's not prime
                return false;
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
