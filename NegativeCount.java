public class NegativeCount{
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int negativeCount = 0;

        for (int num : arr) {
            if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Number of negative integers: " + negativeCount);
    }
}


