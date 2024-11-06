import java.util.*;
public class avg_numtest {
    public static void main(String[] args){
    Avg_num ag_num = new Avg_num();
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers do you want input: ");
    int num = scanner.nextInt();
    scanner.nextLine();
    
   
    for(int i =0;i<num;i++){
        System.out.printf("Input Number %d \n",i);
        int a = scanner.nextInt();
        ag_num.addToNum(a);
    }
    System.out.println();
    ag_num.avg(num);
    }
    
}
