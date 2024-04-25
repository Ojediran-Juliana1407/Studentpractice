//Write a program that performs basic arithmetic operations (add,subtract,divide and multiply)
// on two numbers without using loops or conditional statement
import java.util.Scanner;
public class ArithmeticOperations {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 -num2;
        double multiplication = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + difference);
        System.out.println("Multiplication:" + multiplication);
        System.out.println("Quotient:" + quotient);
    }
}

