public class vectorTestDrive {
    public static void main(String[] args){
        vector vector1 = new vector(3,5);
        vector vector2 = new vector(2,6);

        System.out.println("Vector1: " + vector1);
        System.out.println("Vector2: " + vector2);

        vector sum = vector1.add(vector2);
        System.out.println("vector1 + vector2 = "+ sum);
        vector Substract = vector1.substract(vector2);
        System.out.println("vector1 - vector2 = " + Substract);
        vector Multiply = vector1.multiply(vector2);
        System.out.println("vector1*vector2 = " + Multiply);
    }
}
