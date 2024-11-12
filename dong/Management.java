import java.io.*;
import java.util.Scanner;

public class Management
{
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(new File("input.txt"));
            FileWriter writer = new FileWriter("output.txt"))
        {
            // Read course infor
            String[] course = scanner.nextLine().split(",");
            Course courseInfor = new Course(course[0], course[1]);

            // Read lecturer infor
            String[] lecturer = scanner.nextLine().split(",");
            Lecturer lecturerInfor = new Lecturer(lecturer[0], lecturer[1]);

            // Write course and lecturer infor
            writer.write(courseInfor.display() + "\n");
            writer.write(lecturerInfor.display()+ "\n");

            writer.write("\nStudent Results: \n");

            // Process Student
            while(scanner.hasNextLine())
            {
                String[] student = scanner.nextLine().split(",");
                Student studentInfor = new Student(student[0], student[1], Double.parseDouble(student[2]), Double.parseDouble(student[3]));
                
                writer.write(studentInfor.display() + "\n");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}