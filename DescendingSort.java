import java.util.*;

public class DescendingSort {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3, 7));
        Collections.sort(numbers, (a, b) -> b.compareTo(a));
        
        System.out.println(numbers);
    }
}