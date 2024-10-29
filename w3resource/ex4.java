import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        int var2 = scanner.nextInt();
        System.out.println(products(var1, var2));
    }
    static int products(int var1, int var2){
        int z = var1 * var2;
        return z;
    }
}
