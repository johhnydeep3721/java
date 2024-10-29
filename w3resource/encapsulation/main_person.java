import java.util.Scanner;
public class main_person {
    public static void main(String[] args){
            Person person = new Person();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input name user");
            String name = scanner.nextLine();
            System.out.println("Input age of user");
            Integer age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input Country of user");
            String country = scanner.nextLine();

            person.setName(name);
            person.setage(age);
            person.setCountry(country);
            System.out.println(person.getName());
            System.out.println(person.getage());
            System.out.println(person.getCountry());


    }

}
