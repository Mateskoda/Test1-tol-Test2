package edu.progmatic;

public class Circle {

    private double radius;
    private double x;
    private double y;

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Boolean intersect(Circle other){
        double dist = Math.sqrt(Math.pow(other.x -x, 2) + Math.pow(other.y - y, 2));
        return dist <= radius + other.radius;
    }}
//private static final double PI = 3.
//Körök
//        Felhasználva az előző feladat pont osztályát, készítsük el a Kör osztályt!
//        Egy kör jellemezhető a középpontjával és a sugarának a hosszával!
//        Készítsd el a kör osztályt!
//        Valósítsd meg az alábbi metódusokat:
//
//visszaadja az adott kör területét
//public double getArea
//visszaadja az adott kör kerületét
//public double getCircumference
//megadja, hogy két körnek van-e metszete
//public boolean hasIntersection(Circle other)

//        Szorgalmi: Írj a korábbi 2d-s pont osztályba nyaklánc metódust. A nyaklánc metódus visszatér egy köröket
//        tartalmazó Array-el. A körök mind egy sugarúak, és kör alakban helyezkednek el a pont körül.
//        A kör sugara pedig a metódus bemenő paramétere legyen. Ok, ha a nyaklánc nem ér
//        teljesen össze (de a hézag egynél kisebb legyen)!
