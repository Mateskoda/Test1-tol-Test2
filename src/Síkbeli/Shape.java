package Síkbeli;

public interface Shape {
    public default Class<? extends Shape> classname(){
        return getClass();
    }
    public double perimeter();
public double area();
}
