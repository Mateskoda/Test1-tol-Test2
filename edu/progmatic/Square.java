package edu.progmatic;

public class Square {
 int length;
 Point leftDownPoint;

    public Square(int length, Point leftDownPoint) {
        this.length = length;
        this.leftDownPoint = leftDownPoint;
    }
    public double getArea(){
        return length*length;
    }

    public double getCircumference(){
        return length*4;
    }

    public boolean hasIntersection(Square other){
        if (leftDownPoint.x-other.leftDownPoint.x >0 && (leftDownPoint.x-other.leftDownPoint.x)< other.length && other.length<length+ leftDownPoint.x-other.leftDownPoint.x){
            if (leftDownPoint.y-other.leftDownPoint.y >0 && (leftDownPoint.y-other.leftDownPoint.y)< other.length && other.length<length+ leftDownPoint.y-other.leftDownPoint.y){
                return true;
            }
            if (leftDownPoint.y-other.leftDownPoint.y <0 && Math.abs(leftDownPoint.x-other.leftDownPoint.x)< length && length<Math.abs(length+ leftDownPoint.x-other.leftDownPoint.y)){
                return true;
        }}
        if (leftDownPoint.x-other.leftDownPoint.x < 0 && Math.abs(leftDownPoint.x-other.leftDownPoint.x)<length && length<Math.abs(length+ leftDownPoint.x-other.leftDownPoint.x)){

        if (leftDownPoint.y-other.leftDownPoint.y >0 && (leftDownPoint.y-other.leftDownPoint.y)< other.length && other.length<length+ leftDownPoint.y-other.leftDownPoint.y){
            return true;
        }
        if (leftDownPoint.y-other.leftDownPoint.y <0 && Math.abs(leftDownPoint.x-other.leftDownPoint.x)< length && length<Math.abs(length+ leftDownPoint.x-other.leftDownPoint.y)){
            return true;}
        }return false;


    }
    //megadja, hogy a négyzet tartalmaz-e egy adott pontot
    public boolean contains(Point p){
        if (p.x>=leftDownPoint.x  && (leftDownPoint.x+length)>=p.x && p.y> leftDownPoint.y && leftDownPoint.y +length>=p.y){

            return true;
        }return false;
        
    }

    //visszaadja az adott négyzetbe írható kört
    public Circle insideCircle(){
        Circle c1 = new Circle(length/2d,leftDownPoint.x+length/2d,leftDownPoint.y+ length/2d);
        return c1;
    }

    //visszaadja az adott négyzet köré írható kört
    public Circle outSideCircle(){
        Circle c2 = new Circle((Math.sqrt(Math.pow(length/2d,2)*2)),leftDownPoint.x+length/2d,leftDownPoint.y+ length/2d);
    return c2;
    }
}
