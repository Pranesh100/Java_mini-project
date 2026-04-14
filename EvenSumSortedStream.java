import java.util.Arrays;

public class EvenSumSortedStream {
    
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 8, 1, 9, 4, 7, 6, 3, 10};

       
        int sum = Arrays.stream(arr)
                        .filter(n -> n % 2 == 0)     
                        .sorted()                    
                        .reduce(0, Integer::sum);    

        System.out.println("Original Array : " + Arrays.toString(arr));
        System.out.println("Sum of Even Numbers : " + sum);
    }
}