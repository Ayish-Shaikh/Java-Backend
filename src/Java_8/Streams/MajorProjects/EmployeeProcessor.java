package Java_8.Streams.MajorProjects;

import java.util.Optional;

public class EmployeeProcessor extends Thread{
    //To handle multiple employees at the same time, we use multithreading.
    //The EmployeeProcessor class extends Thread to process employee data in parallel.
    //If an employee doesn't exist, it will print a helpful error message.
    private EmployeeManager employeeManager;
    private int employeeId;

    //EmployeeProcessor class takes an EmployeeManager and an employee ID as input.
    public EmployeeProcessor(EmployeeManager employeeManager , int employeeId){
        this.employeeManager = employeeManager;
        this.employeeId = employeeId;
    }

    @Override
    //Overrides run() to:
    public void run() {
        try{
            //Fetch the employee by ID.
            Optional<Employee> employee = employeeManager.getEmployeeById(employeeId);
            //Use if PresentOrElse() to either print the employee or log not found.
            employee.ifPresentOrElse( emp -> System.out.println("Processing employee: " + emp),() -> System.out.println("Employee with Id " + employeeId + "not found. ")
            );
        }
        //Catch any exception to avoid thread crashes.
        catch (Exception e){
            System.out.println("Error processing employee data: " + e.getMessage());
        }
    }
}
