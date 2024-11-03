import java.util.ArrayList;

public class ArrayListest{
    public static void main(String[] args){
        ArrayList<String> itemsArrayList = new ArrayList<>();
        itemsArrayList.add("item1");
        itemsArrayList.add("item2");
        itemsArrayList.add("item3");

        // for( String item : itemsArrayList){
        //     System.out.print(item+" ");
        // }
        System.out.println(itemsArrayList);
    }
}