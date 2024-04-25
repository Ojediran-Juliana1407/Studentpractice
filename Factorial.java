//create a method named factorial that computes the factorial of a given number using recursion
import java.lang.System;
public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[]args) {
        long result = factorial(20);
        System.out.println("result");

    }

  }


