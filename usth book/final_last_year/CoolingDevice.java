import java.util.*;

public class CoolingDevice{
    int power;
    String brand;
    public CoolingDevice(int power, String brand){
        this.power = power;
        this.brand = brand;  
    }
    public int getPower(){
        return power;
    }
    public String getBrand(){
        return brand;
    }

    public void setPower(int power){
        this.power = power;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void cool(){
        System.out.println("=device is cooling");
    }
    public void displayinfor(){
        
        System.out.println("power: "+power+" brand: "+brand);
    }
}