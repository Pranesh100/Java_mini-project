import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            int count = 1;

            if(words[i].equals("0"))
                continue;

            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            System.out.println(words[i] + " : " + count);
        }
    }
}