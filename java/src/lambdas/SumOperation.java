package lambdas;

/**
 * Demonstrates using a lambda expression with a custom functional interface to perform addition.
 */
public class SumOperation {

    @FunctionalInterface
    interface Sum {
        int addition(int a, int b);
    }

    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;

        System.out.println("Sum of 5 and 10: " + sum.addition(5, 10));
    }
}
