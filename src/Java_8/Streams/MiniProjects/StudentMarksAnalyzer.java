package Java_8.Streams.MiniProjects;

import java.util.List;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ayish" , 24),
                new Student("Abir" , 30),
                new Student("Priya" , 20),
                new Student("Gaurav" , 27)
        );
        System.out.println(" The Average Marks of the student: " + students.stream().mapToInt( s -> s.marks).average().orElse(0));
        students.stream().filter(x -> x.marks>25).forEach( s -> System.out.println("Topper --> " + s.name + " got " + s.marks));
    }
}
class Student{
    public String name;
    public int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}