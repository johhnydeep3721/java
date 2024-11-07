import java.util.*;
public class Avg_num{
    private List<Integer> num ;
    public Avg_num(){
        this.num = new ArrayList<>();
    }
    public List<Integer> getAvg_num(){
        return new ArrayList<>(num);
    }
    public void setAvg_num(List<Integer> NewNum){
        this.num = new ArrayList<>(NewNum);
    }

    public void addToNum(Integer In_num){
        num.add(In_num);
    }
    public void avg(int n){
        int sum = 0;
        for(Integer i:num){
            sum += i;
            System.out.printf("%d ", i);
        }
        double avg_n = sum/n;
        System.out.println("average of number is:" +avg_n);
    }

}