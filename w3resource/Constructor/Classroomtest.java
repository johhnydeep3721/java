import java.util.*;

public class Classroomtest {
    public static void main(String[] args){ 

        Arraylist<String> studentArray = new Arraylist<String>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("How many students Do you have? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<num;i++){
            
        }
        
        Classroom c1 = new Classroom("A01",studentArray);
        c1.printClassroom();
    }
}
