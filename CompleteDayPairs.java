import java.util.Scanner;

public class CompleteDayPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] hours = new int[n];

        System.out.println("Enter the hours:");
        for(int i = 0; i < n; i++) {
            hours[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }

            }
        }

        System.out.println("Pairs = " + count);
    }
}