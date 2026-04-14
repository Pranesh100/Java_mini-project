import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char old = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char nw = sc.next().charAt(0);

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == old) {
                System.out.print(nw);
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}