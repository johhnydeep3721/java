
import java.util.*;
public class String_method {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        
        if(A.compareTo(B)<=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        String firstletter = A.substring(0, 1);
        String remainletter = A.substring(1,A.length());
        firstletter = firstletter.toUpperCase();
        
        A = firstletter + remainletter;
        
        String firstletter1 = B.substring(0,1);
        String remainletter1 = B.substring(1,B.length());
        firstletter1 = firstletter1.toUpperCase();
        
        B = firstletter1 + remainletter1;
        
       
        System.out.println(A + " " + B);
    }
}
