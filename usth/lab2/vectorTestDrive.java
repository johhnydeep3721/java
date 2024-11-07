import java.util.*;

public class vectorTestDrive {
    public static void main(String[] args){


        vector vector1 = new vector(1,0);
        vector vector2 = new vector(0,1);

        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);

        vector sum = vector1.add(vector2);
        System.out.println("vector1 + vector2 = "+ sum);
        vector Substract = vector1.substract(vector2);
        System.out.println("vector1 - vector2 = " + Substract);
        vector Multiply = vector1.multiply(vector2);
        System.out.println("vector1*vector2 = " + Multiply);
        double angleRadians= vector1.anglewith(vector2);
        double angleDegrees = Math.toDegrees(angleRadians);
        System.out.println("Angle between A and B in degrees: "+angleDegrees);
    }
}
