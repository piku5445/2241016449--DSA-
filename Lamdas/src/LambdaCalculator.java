
@FunctionalInterface
interface Calculator {
    double operate(double a, double b);
}
public class LambdaCalculator {
    public static void main(String[] args) {
        // Lambda expression for addition
        Calculator add = (a, b) -> a + b;

        // Lambda expression for subtraction
        Calculator subtract = (a, b) -> a - b;

        // Lambda expression for multiplication
        Calculator multiply = (a, b) -> a * b;

        // Lambda expression for division
        Calculator divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        };

        // Test the lambda expressions
        double a = 10.0;
        double b = 5.0;

        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Subtraction: " + subtract.operate(a, b));
        System.out.println("Multiplication: " + multiply.operate(a, b));
        System.out.println("Division: " + divide.operate(a, b));
    }
}
