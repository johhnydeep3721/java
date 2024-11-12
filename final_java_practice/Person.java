
public class Person{
    private String ID;
    private String name;

    public Person(String ID,String name){
        this.name = name;
        this.ID  = ID;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setID(String newID){
        this.ID = newID;
    }
}