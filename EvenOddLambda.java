public class EvenOddLambda {
    public static void main(String[] args) {
       
        NumberChecker isEven = n -> n % 2 == 0;

        
        NumberChecker isOdd = n -> n % 2 != 0;

        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Even and Odd Checker using Lambda Expressions:\n");

        for (int num : numbers) {
            boolean evenResult = isEven.check(num);
            boolean oddResult = isOdd.check(num);
            System.out.printf("%d → %s%n", num, evenResult ? "Even" : "Odd");
        }
    }
}

