import java.util.*;

import javax.swing.text.StyledEditorKit;

import java.io.*;

public class management {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number of infor Do you want input: ");
        int num = scanner.nextInt();
        scanner.nextLine();

       try(FileWriter writer = new FileWriter("output.txt")){
            List<String> courseIDs = new ArrayList<>();
            List<String> courseNames = new ArrayList<>();
            List<String> lectureIDs = new ArrayList<>();
            List<String> lectureNames = new ArrayList<>();
            List<String> studentIDs = new ArrayList<>();
            List<String> studentNames = new ArrayList<>();
            List<Integer> studentMids = new ArrayList<>();
            List<Integer> StudentFinals = new ArrayList<>();
            

            System.out.println("input Courses: ");
            for(int i = 0;i<num;i++){
                System.out.println("input course ID: ");
                String courseid = scanner.nextLine();
                courseIDs.add(courseid);
                System.out.println("input course Name: ");
                String coursename = scanner.nextLine();
                courseNames.add(coursename);
            }

            System.out.println("input Lecuture: ");
            for(int i =0; i<num;i++){
                System.out.println("input lecture ID: ");
                String lectureid = scanner.nextLine();
                lectureIDs.add(lectureid);
                System.out.println("input lecture Name: ");
                String lectruename = scanner.nextLine();
                lectureNames.add(lectruename);
            }

            System.out.println("input Student: ");
            for(int i=0;i<num;i++){
                System.out.println("input student ID: ");
                String studentid = scanner.nextLine();
                studentIDs.add(studentid);
                System.out.println("input student Name: ");
                String studentname = scanner.nextLine();
                studentNames.add(studentname);
                System.out.println("input Midterm: ");
                Integer studentmid = scanner.nextInt();
                scanner.nextLine();
                studentMids.add(studentmid);
                System.out.println("input Final: ");
                Integer studentfinal = scanner.nextInt();
                scanner.nextLine();
                StudentFinals.add(studentfinal);


            }

            Person course = new Course(courseIDs, courseNames);
            Person lecture = new Lectures(lectureIDs, lectureNames);
            Person student = new Student(studentIDs, studentNames, studentMids, StudentFinals);

            writer.write("Course: \n");
            for(int i = 0;i <courseIDs.size();i++){
                writer.write("ID: "+ courseIDs.get(i)+" name: "+ courseNames.get(i)+".\n");
            }

            writer.write("Lecture: \n");
            for(int i = 0;i<lectureIDs.size();i++){
                writer.write("ID: "+ lectureIDs.get(i)+" name: "+lectureNames.get(i)+".\n");
            }
            writer.write("Student: \n");
            for(int i =0;i<studentIDs.size();i++){
                writer.write("ID: "+studentIDs.get(i)+" name: "+studentNames.get(i)+" midterm mark: "+studentMids.get(i)+" final mark: "+StudentFinals.get(i)+"\n");
                if(studentMids.get(i)>7 && StudentFinals.get(i)>=10){
                    writer.write(studentNames.get(i) + ": " + "Grade passing "+ "\n");
                }
                else{
                    writer.write(studentNames.get(i) + ": " + "Retake students "+"\n");
                }
            }
       }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
