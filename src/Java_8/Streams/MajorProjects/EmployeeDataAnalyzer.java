package Java_8.Streams.MajorProjects;

import java.util.List;

public class EmployeeDataAnalyzer {
    //This is the entry point of our system.
    // It demonstrates how to add employees, process their data using threads, filter and sort employees, and handle errors.
    // The main class uses EmployeeManager to manage employees and EmployeeProcessor to process them concurrently.
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();

        //Adding employees to the sysytem
        employeeManager.addEmployee(new Employee(1 , "Rayan" , "Engineering" , 75000.0));
        employeeManager.addEmployee(new Employee(2 , "Aisha" , "HR" , 58000.0));
        employeeManager.addEmployee(new Employee(3 , "Kabir" , "Finance" , 64000.0));
        employeeManager.addEmployee(new Employee(4 , "Ishita" , "Marketing" , 71000.0));
        employeeManager.addEmployee(new Employee(5 , "Dev" , "Engineering" , 82000.0));
        employeeManager.addEmployee(new Employee(6 , "Rohit" , "Sales" , 55000.0));
        employeeManager.addEmployee(new Employee(7 , "Meera" , "Design" , 60000.0));
        employeeManager.addEmployee(new Employee(8 , "Tanya" , "Support" , 48000.0));
        employeeManager.addEmployee(new Employee(9 , "Aditya" , "Engineering" , 95000.0));
        employeeManager.addEmployee(new Employee(10 , "Sara" , "HR" , 53000.0));
        employeeManager.addEmployee(new Employee(11 , "Vikram" , "Finance" , 67000.0));
        employeeManager.addEmployee(new Employee(12 , "Neha" , "Engineering" , 88000.0));
        employeeManager.addEmployee(new Employee(13 , "Arjun" , "Marketing" , 72000.0));
        employeeManager.addEmployee(new Employee(14 , "Krisha" , "Support" , 46000.0));
        employeeManager.addEmployee(new Employee(15 , "Manav" , "Sales" , 57000.0));
        employeeManager.addEmployee(new Employee(16 , "Rehan" , "Engineering" , 91000.0));
        employeeManager.addEmployee(new Employee(17 , "Priya" , "Finance" , 69000.0));
        employeeManager.addEmployee(new Employee(18 , "Ananya" , "Design" , 63000.0));
        employeeManager.addEmployee(new Employee(19 , "Ravi" , "Marketing" , 75000.0));
        employeeManager.addEmployee(new Employee(20 , "Sneha" , "Support" , 50000.0));
        employeeManager.addEmployee(new Employee(21 , "Zara" , "Engineering" , 98000.0));
        employeeManager.addEmployee(new Employee(22 , "Kabya" , "HR" , 60000.0));
        employeeManager.addEmployee(new Employee(23 , "Om" , "Finance" , 64000.0));
        employeeManager.addEmployee(new Employee(24 , "Harsh" , "Engineering" , 87000.0));
        employeeManager.addEmployee(new Employee(25 , "Ira" , "Design" , 58000.0));
        employeeManager.addEmployee(new Employee(26 , "Nikhil" , "Marketing" , 70000.0));
        employeeManager.addEmployee(new Employee(27 , "Aarav" , "Engineering" , 89000.0));
        employeeManager.addEmployee(new Employee(28 , "Divya" , "Sales" , 56000.0));
        employeeManager.addEmployee(new Employee(29 , "Karan" , "Support" , 49000.0));
        employeeManager.addEmployee(new Employee(30 , "Leena" , "HR" , 61000.0));
        employeeManager.addEmployee(new Employee(31 , "Ritesh" , "Finance" , 65000.0));
        employeeManager.addEmployee(new Employee(32 , "Tara" , "Marketing" , 73000.0));
        employeeManager.addEmployee(new Employee(33 , "Shaan" , "Engineering" , 94000.0));
        employeeManager.addEmployee(new Employee(34 , "Maya" , "Design" , 62000.0));
        employeeManager.addEmployee(new Employee(35 , "Eshan" , "Engineering" , 90000.0));
        employeeManager.addEmployee(new Employee(36 , "Naina" , "Support" , 51000.0));
        employeeManager.addEmployee(new Employee(37 , "Kavya" , "Sales" , 59000.0));
        employeeManager.addEmployee(new Employee(38 , "Rohini" , "Engineering" , 81000.0));
        employeeManager.addEmployee(new Employee(39 , "Tanmay" , "Finance" , 67000.0));
        employeeManager.addEmployee(new Employee(40 , "Aditi" , "Design" , 60500.0));
        employeeManager.addEmployee(new Employee(41 , "Yash" , "Engineering" , 96000.0));
        employeeManager.addEmployee(new Employee(42 , "Sia" , "Marketing" , 74000.0));
        employeeManager.addEmployee(new Employee(43 , "Farhan" , "HR" , 58000.0));
        employeeManager.addEmployee(new Employee(44 , "Rupal" , "Finance" , 68000.0));
        employeeManager.addEmployee(new Employee(45 , "Ajay" , "Engineering" , 83000.0));
        employeeManager.addEmployee(new Employee(46 , "Ishaan" , "Sales" , 55000.0));
        employeeManager.addEmployee(new Employee(47 , "Diya" , "Support" , 48000.0));
        employeeManager.addEmployee(new Employee(48 , "Ritika" , "Design" , 60000.0));
        employeeManager.addEmployee(new Employee(49 , "Varun" , "Engineering" , 88000.0));
        employeeManager.addEmployee(new Employee(50 , "Shreya" , "Marketing" , 72000.0));

        //Simulate multithreading: Processing employee by ID
        Thread processor1 = new EmployeeProcessor(employeeManager, 1);
        Thread processor2 = new EmployeeProcessor(employeeManager, 2);
        Thread processor3 = new EmployeeProcessor(employeeManager, 5);
        Thread processor4 = new EmployeeProcessor(employeeManager, 13);
        Thread processor5 = new EmployeeProcessor(employeeManager, 21);
        Thread processor6 = new EmployeeProcessor(employeeManager, 24);
        Thread processor7 = new EmployeeProcessor(employeeManager, 33);
        Thread processor8 = new EmployeeProcessor(employeeManager, 41);
        Thread processor9 = new EmployeeProcessor(employeeManager, 49);
        Thread processor10 = new EmployeeProcessor(employeeManager, 55);//Non-existing Employee

        processor1.start();
        processor2.start();
        processor3.start();
        processor4.start();
        processor5.start();
        processor6.start();
        processor7.start();
        processor8.start();
        processor9.start();
        processor10.start();

        //wait for thread to complete
        try{
            processor1.join();
            processor2.join();
            processor3.join();
            processor4.join();
            processor5.join();
            processor6.join();
            processor7.join();
            processor8.join();
            processor9.join();
            processor10.join();
        }
        catch(InterruptedException e){
            System.out.println("Error waiting for thread completion: " + e.getMessage());
        }

        //Filtering Employees based on salaries
        System.out.println("\nEmployees with salary >= 70000:");
        List<Employee> highEarners = employeeManager.filterEmployeesBySalary(70000.0);
        highEarners.forEach(System.out::println);

        //Sorting Employees by salary
        System.out.println("\n Employee sorted by salary: ");
        List<Employee> sortedEmployees = employeeManager.sortEmployeesBySalary();
        sortedEmployees.forEach(System.out::println);
    }
}

//This class is an entry point that drives the full application.
//Creates an instance of EmployeeManager.
//Adds four sample employees.
//Creates and starts three threads (EmployeeProcessor) to simulate concurrent access.
//Uses join() to ensure the main thread waits for all processors to finish.
//Filters and prints employees with salary ≥ 70000.
//Sorts and prints all employees by salary.
