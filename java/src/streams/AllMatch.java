package streams;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the use of the allMatch(Predicate) method from Java Streams.
 * <p>
 * The allMatch method returns true if all elements of the stream match the given predicate.
 * It is often used for validation checks on collections.
 * </p>
 *
 * Example:
 * <pre>
 *     List&lt;Integer&gt; numbers = Arrays.asList(2, 4, 6);
 *     boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
 * </pre>
 *
 * Output:
 * Are all numbers even? true
 * </pre>
 *
 * Author: Rajendra
 */
public class AllMatch {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);

        System.out.println("Are all numbers even? " + allEven);
    }
}
