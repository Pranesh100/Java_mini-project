import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {

       
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Aasritha", 45000),
            new Employee(102, "Rahul", 65000),
            new Employee(103, "Priya", 75000),
            new Employee(104, "Amit", 42000),
            new Employee(105, "Sneha", 82000),
            new Employee(106, "Vikram", 38000)
        );

        
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.salary > 50000)          
                .collect(Collectors.toList());

     
        System.out.println("Employees with Salary Above 50000:\n");
        highSalaryEmployees.forEach(System.out::println);
    }
}