import java.sql.Array;
import java.util.*;
public class Classroom{
    private String classname;
    private ArrayList<String> students;

    public Classroom(String classname, ArrayList<String> students){
        this.classname = classname;
        this.students = students;
    }
    public void printClassroom(){
        System.out.println("Classname: " +classname);
        System.out.println("Students: ");
        for(String student: students){
            System.out.print(student + " ");
        }
        System.out.println();
    }
}