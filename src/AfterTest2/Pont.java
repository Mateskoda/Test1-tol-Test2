package AfterTest2;

public class Pont {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont plus2 (){
        return new Pont(x,y);
    }
}
