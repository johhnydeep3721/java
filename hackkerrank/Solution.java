
class Arithmetic {
   
        private int first_num;
        private int second_num;
    
    public int add(int first_num, int second_num){
        return first_num + second_num;
    }

}
    
    class Adder extends Arithmetic{

    }
    
    public class Solution{
        public static void main(String []args){
            // Create a new Adder object
            Adder a = new Adder();
            
            // Print the name of the superclass on a new line
            System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
            
            // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
            System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
         }
    }
