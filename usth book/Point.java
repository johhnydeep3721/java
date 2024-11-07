import java.lang.Math;
public class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double newX){
        this.x = newX;
    }
    public void setY(double newY){
        this.y = newY;
    }
    public double distanceTo(Point other){
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        double a = Math.pow(dx, 2);
        double b = Math.pow(dy, 2);
        return Math.sqrt(a+b);
    }
}
