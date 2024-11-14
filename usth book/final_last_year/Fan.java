public class Fan extends CoolingDevice{
    int speed;
    public Fan(int power, String brand, int speed){
        super(power, brand);
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void Swing(){
        System.out.println("Fan is swing ");
    }
    public void displayinfor(){
        super.displayinfor();
        System.out.println("speed of fan: " + speed);
    }
}
