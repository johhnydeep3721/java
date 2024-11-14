

import java.io.FileWriter;
import java.util.Scanner;

public class Cartest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("input numbers of car: ");
        int n = scanner.nextInt();
        scanner.nextLine();

       
    

        try(FileWriter writer  = new FileWriter("car.txt")){
            Cars[] car = new Cars[n];
            for(int i=0;i<n;i++){
                System.out.println("input car " + (i +1)+" ");
                System.out.println("input brand: ");
                String brand = scanner.nextLine();
                System.out.println("input hoursepower: ");
                double horsepower = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("input price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                car[i] = new Cars(brand, horsepower, price);
                
            }
            
            for(Cars c:car){
            
                writer.write(c.carinfor());
            }



        }
         catch (Exception e) {
            e.printStackTrace();
        }



    }
}
