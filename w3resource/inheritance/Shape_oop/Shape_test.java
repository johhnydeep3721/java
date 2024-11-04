
import java.util.*;

public class Shape_test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input length of Rectangle: ");
        double length = scanner.nextDouble();
        scanner.nextLine();
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        double area = rectangle.getArea();
        System.out.println("Area of Rectangle is " + area);
    }
}
