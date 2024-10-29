import java.util.Scanner;
import java.math.*;
public class ex6_radius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("input radius");
        float var1 = scan.nextFloat();
        System.out.println("Perimeter is " + perimeter(var1));
        System.out.println("Area is " + area(var1));
    }
    static double perimeter(float var1){
        return (2*Math.PI*var1);
        
    }
    static double area(float var1){
          return (Math.PI*Math.pow(var1,2));
    }
}
