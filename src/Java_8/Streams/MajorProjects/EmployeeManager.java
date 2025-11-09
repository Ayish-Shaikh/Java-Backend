package Java_8.Streams.MajorProjects;


import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManager {
    //This class is responsible for managing the employee data, including adding, fetching, filtering, and sorting employees.
    //This class is used to handle employee data.
    //It allows us to add employees, retrieve them by ID, filter employees based on salary, and sort employees by salary.

    //employeeData is a HashMap<Integer, Employee> to store employees by ID.
    private Map<Integer , Employee> employeeData;

    public EmployeeManager(){
        this.employeeData = new HashMap<>();
    }

    //addEmployee() method adds a new employee to the map.
    public void addEmployee(Employee employee){
        employeeData.put(employee.getId(), employee);
    }

    //getEmployeeById(int id) method safely returns an employee using Optional.
    public Optional<Employee> getEmployeeById(int id){
        return Optional.ofNullable(employeeData.get(id));
    }

    //getAllEmployees() method returns a list of all employees.
    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeData.values());
    }

    //filterEmployeesBySalary(Double minSalary) method filters employees whose salary ≥ minSalary using Stream.
    public List<Employee> filterEmployeesBySalary(Double minSalary){
        return employeeData.values().stream().filter(employee -> employee.getSalary().orElse(0.0) >= minSalary).collect(Collectors.toList());
    }

    //sortEmployeesBySalary() method sorts all employees by their salary using Comparator
    public List<Employee> sortEmployeesBySalary(){
        return employeeData.values().stream().sorted(Comparator.comparingDouble( x -> x.getSalary().orElse(0.0))).collect(Collectors.toList());
    }
}
