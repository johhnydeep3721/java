import java.util.*;
import java.io.*;

public class TestCourse {
    public static void main(String[] args){
        List<studentID> students = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
            String line;
            while ((line = reader.readLine())!=null) {
                String data[] = line.split(",");
                String courseID = data[0].trim();
                String courseName =data[1].trim();
                String lectureid = data[2].trim();
                String lectureName = data[3].trim();
                String studentID = data[4].trim();
                String studentName = data[6].trim();
                Double studentMid = Double.parseDouble(data[7].trim());
                Double studentFinal = Double.parseDouble(data[8].trim());

                LectureID lecture = new LectureID(lectureid, lectureName);
                Course course = new Course(courseID, courseName, lecture);
                studentID student = new studentID(studentID, studentName, studentMid, studentFinal);
                students.add(student);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            for(studentID student : students){
                String result = student.eveluatePerformance();
                writer.write("StudentID: " + student.getID()+ "Name: " + student.getName() + ", Result: " +result);
                writer.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
