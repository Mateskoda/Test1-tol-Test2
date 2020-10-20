import edu.progmatic.Point;

public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //visszaadja az adott kör területét
    public double getArea (){
        return (3.14*Math.pow(radius,2));
    }
    //visszaadja az adott kör kerületét
    public double getCircumference(){
        return (2*3.14*radius);
    }
    //megadja, hogy két körnek van-e metszete
    public int hasIntersection(Circle other){

        if (this.center.distance(other.center)<this.radius+ other.radius){
            return -1;

        }
        else if (this.center.distance(other.center)==this.radius+ other.radius) {
            return 1;
        }
        else return 2;
    }

//    Szorgalmi: Írj a korábbi 2d-s pont osztályba nyaklánc metódust.
//    A nyaklánc metódus visszatér egy köröket tartalmazó Array-el. A körök mind egy sugarúak,
//    és kör alakban helyezkednek el a pont körül. A kör sugara pedig a metódus bemenő paramétere
//    legyen. Ok, ha a nyaklánc nem ér teljesen össze (de a hézag egynél kisebb legyen)!
//public Circle [] necklace (Point center){
//        Circle [] arrayOfCircle = new Circle[37];
//        Circle c1 = new Circle(center,36);
//        arrayOfCircle[0] = c1;
//}
}
