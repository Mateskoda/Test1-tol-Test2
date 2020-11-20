package Síkbeli;

public class Square implements Shape{
    double a;
    public double perimeter(){
   double perimeter=a*4;
    return perimeter;
    }

    public Square(double a) {
        this.a = a;
    }

    public double area(){
        double area = a*a;
        return area;
    }
}
