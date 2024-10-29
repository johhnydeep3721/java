public class Dog {
    private String name;
    private String color;

    public Dog(){
        this.name = "tom";
        this.color = "black";
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public static void main(String[] args){
        Dog myDog = new Dog();
        System.out.println("the name of dog is " + myDog.getName());
        System.out.println("the color of dog is " + myDog.getColor());
    }
}
