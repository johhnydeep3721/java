public class array {
    public static void main(String[] args){
        int[] num = {2,1,4,6,3,9,7,8};
        int var = num.length;

        int max = 0;
        for(int i=0;i < var;i++){
            if(num[i]>=max){
                max =num[i];
                System.out.println(max);
            }
        }
    }
}