import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_num = scanner.nextInt();
        int second_num = scanner.nextInt();
        System.out.println(add(first_num, second_num));
    }
    static int add(int x, int y){
        int z = x + y;
        return z;
    }
}
