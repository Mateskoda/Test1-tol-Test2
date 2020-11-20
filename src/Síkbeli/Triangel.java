package Síkbeli;

public class Triangel implements Shape{
    double a;
    public double perimeter(){
        double perimeter=4*a;
        return perimeter;
    }

    public Triangel(double a) {
        this.a = a;
    }

    public double area(){
        double area = a*a;
        return area;
    }
}
