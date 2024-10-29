public class main {
    public static void main(String[] args) {
        Employee emp = new Employee(10000);
        HRmanager mgr = new HRmanager(20000);
        emp.work(); 
        System.out.println("Employee salary: "+emp.getSalary());
        mgr.work();
        System.out.println(("Maneger salary: "+mgr.getSalary()));
        mgr.addemployee();
    }   

}
