public class AirConditioner extends CoolingDevice {
    boolean inverter;

    public AirConditioner(int power, String brand, boolean inverter){
        super(power, brand);
        this.inverter = inverter;
    }
    public boolean getInverter(){
        return inverter;
    }
    public void setInverter(boolean inverter){
        this.inverter = inverter;
    }
    public void dry(){
        System.out.println("AirConditioner is drying mode.. ");
    }

    public void Onlyfan(){
        System.out.println("AirCondition is onlyfan mode.. ");
    }
    
    public void displayinfor(){
        super.displayinfor();
        System.out.println("Inverter "+(inverter?"yes":"no"));
    }

}
