import java.util.Arrays;
public class MoveZeroesStream {   
    public static void main(String[] args) {
        
        int[] arr = {5, 0, 3, 0, 0, 8, 1, 0, 2, 4};

        int[] nonZeros = Arrays.stream(arr)
                               .filter(n -> n != 0)
                               .toArray();

        int[] result = new int[arr.length];

        for (int i = 0; i < nonZeros.length; i++) {
            result[i] = nonZeros[i];
        }
        System.out.println("Original : " + Arrays.toString(arr));
        System.out.println("Result   : " + Arrays.toString(result));
    }
}