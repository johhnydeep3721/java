import java.util.Scanner;
import java.util.*;;

public class ex12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("calculate f(x) = a*x^2 + bx^2 + c");

        System.out.println("input numbers a have to even: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("input numbers b have to odd: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        int c = random.nextInt(1001);
        System.out.println("Random value of c: " +c);

        System.out.println("input number of n is: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("input number of m is: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("input number of x is: ");
        double x = scanner.nextInt();
        scanner.nextLine();

        if(a%2==0 && b%2!=0 && n>0 && m >0){
            double result = a*Math.pow(x, n)+b*Math.pow(b, m)+c;
            System.out.println("the result of fucntion f(x) is : "+result);
        }
        else{
            System.out.println("Can't calculate!");
        }

    }
}
