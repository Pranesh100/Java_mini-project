import java.util.Arrays;
import java.util.List;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvens = numbers.stream()
                                .filter(n -> n % 2 == 0)      // even numbers
                                .mapToInt(Integer::intValue)  // convert to IntStream
                                .sum();

        System.out.println("Sum of all even numbers: " + sumOfEvens);
    }
}