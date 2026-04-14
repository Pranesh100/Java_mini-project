import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileLine {
    public static void main(String[] args) {
        String filename = "student_info.txt"; 
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}