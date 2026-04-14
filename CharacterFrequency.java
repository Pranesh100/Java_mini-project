import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String str = sc.nextLine();


        System.out.print("Enter a character to search: ");
        char ch = sc.next().charAt(0);

        int count = 0;


        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }


        if(count > 1) {
            System.out.println("Character is repeating");
            System.out.println("Frequency: " + count);
        } 
        else if(count == 1) {
            System.out.println("Character is present but not repeating");
        } 
        else {
            System.out.println("Character not found");
        }

        sc.close();
    }
}