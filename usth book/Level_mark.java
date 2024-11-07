import java.io.*;
import java.util.*;



public class Level_mark {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input marks of students");
            String markInput = reader.readLine();
            int mark = Integer.parseInt(markInput);
            if(mark >= 0 && mark <= 9){
                System.out.println("Fail");
            }
            else if(mark >= 10 && mark <= 12){
                System.out.println("Average");
            }
            else if(mark >= 12 && mark <= 14){
                System.out.println("Above Average");
            }
            else if(mark >= 15 && mark <= 16){
                System.out.println("Good");
            }
            else if(mark >= 17 && mark <= 18){
                System.out.println("Excellent");
            }
            else if(mark >= 19 && mark <= 20){
                System.out.println("Outstanding");
            }
            else{
                System.out.println("not appriciate");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
