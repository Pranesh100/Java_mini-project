import java.util.Arrays;
import java.util.List;

public class OddNumbersStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        List<Integer> result = Arrays.stream(arr)          
                .filter(n -> n % 2 != 0)                    
                .sorted()                                   
                .map(n -> n * 2)                            
                .boxed()                                    
                .toList();                                  

        System.out.println(result);
    }
}