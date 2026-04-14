import java.io.FileWriter;
import java.io.IOException;

public class Student {

    private int id;
    private String name;
    private String course;
    private double gpa;


    public Student(int id, String name, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + course + "," + gpa;
    }

    public static void main(String[] args) {
        
        // Create some student objects
        Student s1 = new Student(101, "Aasritha Sharma", "Computer Science", 9.2);
        Student s2 = new Student(102, "Rahul Verma", "Mechanical Engineering", 8.5);
        Student s3 = new Student(103, "Priya Patel", "Information Technology", 9.8);

        // Write to file
        writeStudentsToFile("students.csv", s1, s2, s3);
    }

    public static void writeStudentsToFile(String filename, Student... students) {
        
        try (FileWriter writer = new FileWriter(filename)) {
            
            // Write header
            writer.write("ID,Name,Course,GPA\n");
            
            // Write each student
            for (Student student : students) {
                writer.write(student.toString() + "\n");
            }
            
            System.out.println("✅ Students data successfully written to " + filename);
            
        } catch (IOException e) {
            System.err.println("❌ Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}