import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class employeetest{
    public static void main(String[] args){
        employees Employees = new employees();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employee Do you want to input? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        try(FileWriter writer = new FileWriter("employees.txt")){
            
    
             for(int i=0;i<num;i++){
                int a = i+1;
                System.out.println("Number ID: "+ a);
                Employees.AddtoID(a);
                System.out.println("Input Name employee: ");
                String name = scanner.nextLine();
                Employees.AddtoName(name);
                System.out.println("input Department: ");
                String Department = scanner.nextLine();
                Employees.AddtoDepartment(Department);
                System.out.println("input basic_salary: ");
                Double bSalary = scanner.nextDouble();
                Employees.AddToBasicSalary(bSalary);
                System.out.println("input extra_salary: ");
                Double eSalary = scanner.nextDouble();
                Employees.AddToExtraSalary(eSalary);
                scanner.nextLine();

                Double income = bSalary + (eSalary*2.5);


                writer.write(a+","+name+","+Department+","+bSalary+","+eSalary+","+income);
                writer.write(".\n");
                

         }

        }
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("=== Employee Detail ===");
        for(int i = 0;i<Employees.getEmployeeID().size();i++){
            System.out.println("Employee ID: "+Employees.getEmployeeID().get(i));
            System.out.println("Name: "+Employees.getEmployeeName().get(i));
            System.out.println("Department: "+Employees.getDepartment().get(i));
            System.out.println("basic salary: "+Employees.getBasic().get(i));
            System.out.println("extra salary: "+Employees.getExtra().get(i));
            Double income = Employees.getBasic().get(i)+(Employees.getExtra().get(i)*2.5);
            System.out.println("income: "+income);
            System.out.println("----------------------------------");
        }

    }
}