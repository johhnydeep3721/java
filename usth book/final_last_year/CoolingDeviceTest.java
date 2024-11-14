import java.util.*;

public class CoolingDeviceTest {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("enter number of fan object (n): ");
       int n = scanner.nextInt();
       scanner.nextLine();

       System.out.print("enter number of Airconditioner (m): ");
       int m = scanner.nextInt();
       scanner.nextLine();

       Fan[] fan = new Fan[n];
       for(int i =0;i<n;i++){
        System.out.println("enter detail for fan " + (i+1)+ ": ");
        System.out.println("input power: ");
        int power = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input brand: ");
        String brand = scanner.nextLine();
        System.out.println("input speed: ");
        int speed = scanner.nextInt();
        scanner.nextLine();
        fan[i] = new Fan(power, brand, speed);
       }

       AirConditioner[] airConditioners = new AirConditioner[m];
       for(int i = 0; i<m;i++){
        System.out.println("enter detail for airConditioners "+ (i+1)+": ");
        System.out.println("input power: ");
        int power = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input brand: ");
        String brand = scanner.nextLine();
        System.out.println("input inverter: ");
        boolean inverter = scanner.nextBoolean();
        scanner.nextLine();
        airConditioners[i] = new AirConditioner(power, brand, inverter);
       }
       
       System.out.println("print all device infor: ");
       for(Fan f : fan){
        f.displayinfor();
        System.out.println();
       }

       for(AirConditioner a:airConditioners){
            a.displayinfor();
            System.out.println();
       }
       
       System.out.println("making fan swing: ");
       for(Fan f : fan){
        f.Swing();
        System.out.println();
       }

       System.out.println("setting dry aircondition: ");
       for(AirConditioner a: airConditioners){
        a.dry();
        System.out.println();
       }


    }
}
