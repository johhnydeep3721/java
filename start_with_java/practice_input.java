import java.util.Scanner;
public class practice_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name ? ");
        String name = scanner.nextLine();
        System.out.println("How old are you ? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favourite food ? ");
        String food = scanner.nextLine();

        System.out.println("Hello my name is: " + name);
        System.out.println("You are "+age+" years old");
        System.out.println("you like "+ food);
    }
}