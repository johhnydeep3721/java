import java.util.*;

import javax.naming.spi.DirObjectFactory;

public class employees {
    private List<Integer> employeeID;
    private List<String> employee_name;
    private List<String> department;
    private List<Double> basic_salary;
    private List<Double> Extra_salary;

    public employees(){
        this.employeeID = new ArrayList<>();
        this.employee_name = new ArrayList<>();
        this.department = new ArrayList<>();
        this.basic_salary = new ArrayList<>();
        this.Extra_salary = new ArrayList<>();
    }

    public List<Integer> getEmployeeID(){
        return new ArrayList<>(employeeID);
    }
    public List<String> getEmployeeName(){
        return new ArrayList<>(employee_name);
    }
    public List<String> getDepartment(){
        return new ArrayList<>(department);
    }

    public List<Double> getBasic(){
        return new ArrayList<>(basic_salary);
    }

    public List<Double> getExtra(){
        return new ArrayList<>(Extra_salary);
    }

    public void setEmployeeID(List<Integer> newID){
        this.employeeID = new ArrayList<>(newID);
    }

    public void setEmployeeName(List<String> newName){
        this.employee_name = new ArrayList<>(newName);
    }

    public void setDepartment(List<String> newDepartment){
        this.department = new ArrayList<>(newDepartment);
    }

    public void setBasicSalary(List<Double> newBasic){
        this.basic_salary = new ArrayList<>(newBasic);
    }
    public void setExtrasalary(List<Double> newExtra){
        this.Extra_salary = new ArrayList<>(newExtra);
    }

    public void AddtoID(Integer ID){
        employeeID.add(ID);
    }

    public void AddtoName(String Name){
        employee_name.add(Name);
    }

    public void AddtoDepartment(String Dpt){
        department.add(Dpt);
    }

    public void AddToBasicSalary(Double Bsalary){
        basic_salary.add(Bsalary);
    }
    public void AddToExtraSalary(Double Esalary){
        Extra_salary.add(Esalary);
    }

    
}
