import java.io.*;

public class Point_test {
    public static void main(String[] args){ 
        
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("input point a1");
            String a1Input = reader.readLine();
            double a1 = Double.parseDouble(a1Input);
            System.out.println("input point b1");
            String b1Input = reader.readLine();
            double b1 = Double.parseDouble(b1Input);
            Point point1 = new Point(a1, b1);

            System.out.println("input point a2");
            String a2Input = reader.readLine();
            double a2 = Double.parseDouble(a2Input);
            System.out.println("input point b2");
            String b2Input = reader.readLine();
            double b2 = Double.parseDouble(b2Input);
            Point point2 = new Point(a2, b2);

            double Distance = point1.distanceTo(point2);
            System.out.println("Distance between two point is: " + Distance);

        } 
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
