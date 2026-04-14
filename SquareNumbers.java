import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)           // square each number
                                       .collect(Collectors.toList());

        System.out.println("Square of all numbers: " + squares);
    }
}