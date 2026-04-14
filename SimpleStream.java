import java.util.List;

public class SimpleStream {
    
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      
        int normalSum = list.stream()
                            .filter(n -> n % 2 == 0)
                            .map(n -> n * n)
                            .reduce(0, Integer::sum);

        System.out.println("Normal Stream Sum: " + normalSum);

       
        int parallelSum = list.parallelStream()
                              .filter(n -> n % 2 == 0)
                              .map(n -> n * n)
                              .reduce(0, Integer::sum);

        System.out.println("Parallel Stream Sum: " + parallelSum);
    }
}