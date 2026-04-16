import java.util.*;

public class Project3 {

    static String checkStrength(String password) {
        int score = 0;

        if (password.length() >= 8) score++;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                score++;
                break;
            }
        }

        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                score++;
                break;
            }
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                score++;
                break;
            }
        }

        if (score <= 1) return "Weak";
        else if (score == 2 || score == 3) return "Medium";
        else return "Strong";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        System.out.println("Password Strength: " + checkStrength(pass));
    }
}