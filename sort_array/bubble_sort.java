import java.util.*;
public class bubble_sort{

        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number: ");
        int n = scanner.nextInt();

        int sort[] = new int[n];

        for(int i = 0;i < n;i++){

            System.out.printf("Enter the number %d:\n",i+1);
            sort[i] = scanner.nextInt();
        }
    
        for(int i= 0;i < n-1 ;i++){
            for(int j = 0;j <n-i-1;j++){
                if(sort[j]<sort[j+1]){
                    int temp =sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }

        System.out.println("The sorted array");
        for(int i = 0;i<n;i++){
            System.out.printf("%d ",sort[i]);
        }
    }
}