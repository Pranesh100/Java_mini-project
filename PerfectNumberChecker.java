
@FunctionalInterface
interface NumberChecker {
    boolean check(int num);
}

public class PerfectNumberChecker {

    public static void main(String[] args) {

      
        NumberChecker isPerfect = n -> {
            if (n <= 1) return false;

            int sum = 1; 

            
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                    if (i != n / i && n / i != n) {
                        sum += n / i;
                    }
                }
            }
            return sum == n;
        };

        
        int[] numbers = {6, 28, 496, 8128, 7, 12, 100};

        System.out.println("Perfect Number Checker using Functional Interface:\n");

        for (int num : numbers) {
            boolean result = isPerfect.check(num);
            System.out.printf("%d → %s%n", num, result ? "Perfect Number" : "Not Perfect");
        }

       
        System.out.println("\n--- Using method reference style ---");
        NumberChecker isEven = n -> n % 2 == 0;
        
        System.out.println("6 is even? " + isEven.check(6));
        System.out.println("7 is even? " + isEven.check(7));
    }
}