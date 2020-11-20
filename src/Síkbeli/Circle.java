package Síkbeli;

public class Circle implements Shape{
    double r;
    public double perimeter(){
        double perimeter=2*Math.PI*r;
        return perimeter;
    }

    public Circle(double r) {
            this.r = r;
    }

    public double area(){
        double area = Math.PI*r*r;
        return area;
    }
}

