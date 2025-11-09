package Java_8.Streams.MajorProjects;

import java.util.Optional;

public class Employee {
    //This class holds the details of an employee.
    // Each employee has an ID, a name, a department, and a salary.
    //The salary is wrapped in an Optional to handle cases where the salary might be missing.

    //contains private fields --> id , name , department , salary
    private int id;
    private String name;
    private String department;
    private Double salary;

    //constructors used to initialize the fields
    public Employee(int id , String name , String department , Double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //Getter method return field values
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    //getSalary() uses Optional.ofNullable() to safely handle null salary values.
    public Optional<Double> getSalary() {
        return Optional.ofNullable(salary);
    }

    //toString() is overridden for clean object output (used in System.out.println())
    @Override
    public String toString() {
        return "Employee{id= " + id + ", name='" + name + "', department='" + department + "', salary=" + salary +'}';
    }
}
