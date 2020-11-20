package Síkbeli;

public class Hexa implements Shape{
    double a;
    public double perimeter(){
        double perimeter=6*a;
        return perimeter;
    }

    public Hexa(double a) {
        this.a = a;
    }

    public double area(){
        double area = a*a*3*Math.sqrt(3)/2;
        return area;
    }
}
