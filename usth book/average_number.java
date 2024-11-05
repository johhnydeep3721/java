import java.util.*;

public class average_number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many number do you want to input: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> num = new ArrayList<Integer>();

        
        for(int i = 0;i<n;i++){
            System.out.println("input number: ");
            int x = scanner.nextInt();
            num.add(x);
        }
        int sum = 0;
        for(int j : num){
            sum += j;
            System.out.printf("%d ", j);
        }
        System.out.printf("\n");
        double avg = sum/n ;
        System.out.println(avg);

    }
}