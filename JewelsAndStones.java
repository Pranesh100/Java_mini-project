import java.util.Scanner;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr = new int[127];  
        
        
        for (char c : stones.toCharArray()) {
            arr[c]++;
        }
   
        int count = 0;
        for (char c : jewels.toCharArray()) {
            count += arr[c];
        }
        
        return count;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter jewels string: ");
        String jewels = scanner.nextLine();
        
        System.out.print("Enter stones string: ");
        String stones = scanner.nextLine();
        
        JewelsAndStones solution = new JewelsAndStones();
        int result = solution.numJewelsInStones(jewels, stones);
        
        System.out.println("Number of jewels in stones: " + result);
        
        scanner.close();
    }
}