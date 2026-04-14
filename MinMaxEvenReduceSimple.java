import java.util.Arrays;

public class MinMaxEvenReduceSimple {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 2, 3, 8, 70};

        int minEven = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .reduce(Integer.MAX_VALUE, Math::min);

        int maxEven = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .reduce(Integer.MIN_VALUE, Math::max);

        if (minEven == Integer.MAX_VALUE) {
            System.out.println("No even numbers found in the array");
            return;
        }

        int result = (minEven * 2) + (maxEven * 2);

        System.out.println("Lowest Even  : " + minEven);
        System.out.println("Highest Even : " + maxEven);
        System.out.println("Final Result : " + result);
    }
}