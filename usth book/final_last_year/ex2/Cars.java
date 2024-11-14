

import javax.xml.stream.events.StartDocument;

public class Cars{
    String brand;
    double horsepower;
    double price;

    public Cars(String brand, double horsepower, double price){
        this.brand = brand;
        this.horsepower = horsepower;
        this.price = price;
    }

    public String getBrand(){
        
        return brand;
    }

    public double getHorsepower(){
        return horsepower;
    }
    public double getPrice(){
        return price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setHorsepower(double horsepower){
        this.horsepower = horsepower;
    }
    public void setPrice(double price){
        this.price = price;

    }

    public String carinfor(){
        return "brand: "+brand + "\n"+" horsepower: "+horsepower+ "\n"+" price: "+price +"\n";
    }
}