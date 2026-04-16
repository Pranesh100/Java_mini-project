import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class Project2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Delete 5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    list.add(new Student(id, name, age));
                    break;

                case 2:
                    for (Student s : list) {
                        s.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int sid = sc.nextInt();
                    for (Student s : list) {
                        if (s.id == sid) {
                            s.display();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    list.removeIf(s -> s.id == did);
                    break;

                case 5:
                    return;
            }
        }
    }
}


