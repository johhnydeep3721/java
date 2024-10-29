import java.util.Scanner;
import java.time.LocalDate;

public class DataAndTime {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user to enter the month, day, and year
            System.out.println("Enter month: ");
            int month = scanner.nextInt();

            System.out.println("Enter day: ");
            int day = scanner.nextInt();

            System.out.println("Enter year: ");
            int year = scanner.nextInt();

            // Output the day of the week
            System.out.println(findDay(month, day, year));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers for month, day, and year.");
        } finally {
            scanner.close(); // Ensure the scanner is closed after use
        }
    }
}
