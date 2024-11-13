import java.util.*;

public class Person{
    protected List<String> ID;
    protected List<String> Name;

    public Person(List<String> ID,List<String> Name){
        this.ID = new ArrayList<>(ID);
        this.Name = new ArrayList<>(Name);

    }

    public List<String> getID(){
        return new ArrayList<>(ID);
    }

    public List<String> getName(){
        return new ArrayList<>(Name);
    }

    public void setID(List<String> NewID){
        this.ID = new ArrayList<>(NewID);
    }

    public void setName(List<String> NewName){
        this.Name = new ArrayList<>(NewName);
    }

}