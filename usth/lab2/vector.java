import java.util.*;
import java.lang.Math;
public class vector {
    private double x;
    private double y;
    public vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double newX ){
        this.x =newX;
    }
    public void getY(double newY ){
        this.y =newY;
    }

    public vector add(vector other){
        return new vector(this.x + other.x, this.y+other.y);
    }
    public vector substract(vector other){
        return new vector(this.x - other.x, this.y - other.y);
    }
    public vector multiply(vector other){
        return new vector(this.x*other.x, this.y*other.y);
    }
    
    public String toString(){
        return "(" +x +", " + y + ")";
    }
}
