import java.util.*;

public class Lectures extends Person {
    public Lectures(List<String> ID, List<String> Name){
        super(ID, Name);
    }
    public void addToLecID(String Idlec){
        ID.add(Idlec);
    }

    public void addTolecName(String NameLec){
        Name.add(NameLec);
    }
}