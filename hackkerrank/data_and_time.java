import java.util.Scanner;
import java.time.LocalDate;

public class data_and_time{
    
    public static String finDay(int month, int day, int year){
        LocalDate data = LocalDate.of(year,month,day);
        return data.getDayOfWeek().toString();
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(finDay(month, day, year));
       
    }
}