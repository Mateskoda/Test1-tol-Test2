package AfterTest2;

public class Pont3D extends Pont{
    int z;

    public Pont3D(int x,int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public Pont3D plus2() {

        return new Pont3D(x+2,y+2,z+2);
    }
}
