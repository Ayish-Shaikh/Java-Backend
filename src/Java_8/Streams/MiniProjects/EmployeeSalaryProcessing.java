package Java_8.Streams.MiniProjects;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryProcessing {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Abir", "IT", 70000),
                new Employee("Ayish", "HR", 90000),
                new Employee("Meena", "IT", 80000),
                new Employee("Suresh", "Finance", 60000),
                new Employee("Riya", "Frontend", 125000),
                new Employee("Aman", "DevOps", 135000),
                new Employee("Neha", "QA", 110000),
                new Employee("Sahil", "Backend", 145000),
                new Employee("Kiran", "Data Science", 160000),
                new Employee("Rohit", "Mobile", 130000),
                new Employee("Sneha", "UI/UX", 120000),
                new Employee("Tara", "Cybersecurity", 155000),
                new Employee("Vikram", "Full Stack", 150000),
                new Employee("Isha", "Machine Learning", 170000),
                new Employee("Deepak", "Cloud", 155000),
                new Employee("Aditi", "Frontend", 115000),
                new Employee("Manav", "DevOps", 140000),
                new Employee("Simran", "QA", 108000),
                new Employee("Arjun", "Backend", 138000),
                new Employee("Meera", "Data Analytics", 145000),
                new Employee("Ravi", "Mobile", 125000),
                new Employee("Pooja", "Cloud", 150000),
                new Employee("Kunal", "Full Stack", 160000)
        );
        System.out.println(employees.stream().collect(Collectors.groupingBy(EmployeeSalaryProcessing::apply, Collectors.averagingDouble(EmployeeSalaryProcessing::applyAsDouble))));
    }

    private static String apply(Employee x) {
        return x.dept;
    }

    private static double applyAsDouble(Employee x) {
        return x.salary;
    }
}
class Employee{
    public String name, dept;
    public double salary;

    Employee(String name , String dept , double salary){
        this.name = name;
        this.dept = dept;
        this.salary= salary;
    }
}