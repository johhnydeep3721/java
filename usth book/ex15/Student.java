import java.util.*;

public class Student extends Person {
    List<Integer> Mid;
    List<Integer> Final;
    public Student(List<String> ID, List<String> Name, List<Integer> Mid,List<Integer> Final){
        super(ID, Name);
        this.Mid = new ArrayList<>(Mid);
        this.Final = new ArrayList<>(Final);
    }

    public List<Integer> getMid(){
        return new ArrayList<>(Mid);
    }

    public List<Integer> getFinal(){
        return new ArrayList<>(Final);
    }

    public void setMid(List<Integer> newMid){
        this.Mid = new ArrayList<>(newMid);
    }

    public void setFinal(List<Integer> newFinal){
        this.Final = new ArrayList<>(newFinal);
    }

    public void addIdStudent(String IdStu){
        ID.add(IdStu);
    }
    public void addNameStudent(String NameStu){
        Name.add(NameStu);
    }

    public void addMidStudent(Integer mid){
        Mid.add(mid);
    }
    public void addFinalStudent(Integer newFinal){
        Final.add(newFinal);
    }
}
