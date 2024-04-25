// Create a mmethod named isPrime that takes an integer and returns true if the number
// is a prime number and return otherwise.

public class MyPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i ==0) {
                return false;
            }
        }
        return true;

    }
    public static void main (String[]args) {
        int num = 10;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " not a prime number");
        }
    }
}
