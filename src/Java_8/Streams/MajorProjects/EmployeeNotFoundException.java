package Java_8.Streams.MajorProjects;

public class EmployeeNotFoundException extends Exception{
    //This class defines a custom exception that will be thrown if an employee is not found in the system.
    //This helps us handle missing employee records gracefully.

    //A custom exception class for handling "employee not found" cases.
    // Extends Exception and accepts a message in the constructor.
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
