//to write your name, department and college in a file using filewriter
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) {
        String name = "niah";
        String department = "Computer Science";
        String college = "University";
        try (FileWriter writer = new FileWriter("student_info.txt")) {
            writer.write("Name: " + name + "\n");
            writer.write("Department: " + department + "\n");
            writer.write("College: " + college + "\n");
            System.out.println("Student information successfully written to student_info.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}