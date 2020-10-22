package AutosFeladat;

public class Car {

    private Tire[] t = new Tire[4];
    private Engine engine;

    public Tire[] getTires() {
        return t;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tire();

        }
        engine = new Engine();

    }
    //public boolean getStatus
}
