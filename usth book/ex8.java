import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){

        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int square[] = new int[num];
        int sum = 0;
        for(int i =0 ; i<num;i++){
            System.out.println("input square: ");
            square[i] = scanner.nextInt();
            sum += square[i];
            }  
        System.out.println("sum of squares: "+ sum);
          


        }


        
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
