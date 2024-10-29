import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = new GregorianCalendar(year, month - 1, day);  // Calendar months are 0-based

        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Convert the day of the week to a string
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[dayOfWeek - 1];  // Calendar.DAY_OF_WEEK starts from 1 (Sunday)
    }
}
