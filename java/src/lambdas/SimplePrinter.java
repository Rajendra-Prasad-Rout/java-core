package lambdas;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates basic usage of a lambda expression to print elements in a list.
 */
public class SimplePrinter {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj", "Vicky", "Aman");

        names.forEach(name -> System.out.println("Name: " + name));
    }
}
