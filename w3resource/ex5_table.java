import java.util.Scanner;
public class ex5_table {

    static void table(int num){
        for(int i =1; i<=10;i++){
            int z = num*i;
            System.out.printf("%d * %d = %d%n",num,i,z);
        }
    }
    public static void main(String[] args) {
        
    Scanner var1 = new Scanner(System.in);
    int num = var1.nextInt();
    table(num);
    var1.close();
    }

}
