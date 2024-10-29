public class Cow {
    private String name;
    private String breed;
    private int age;

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setBreed(String newBreed){
        this.breed = newBreed;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void moo(){
        System.out.print("Moo...!");
    }

        
}
