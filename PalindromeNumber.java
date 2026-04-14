public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;   
        String str = Integer.toString(num);

        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }

    }
}