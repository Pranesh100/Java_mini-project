import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        int sum = 0;
        int product = 1;

        while (num != 0) {
            int digit = num % 10;   // extract last digit
            sum = sum + digit;      // add digit to sum
            product = product * digit; // multiply digit
            num = num / 10;         // remove last digit
        }

        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }

        sc.close();
    }
}