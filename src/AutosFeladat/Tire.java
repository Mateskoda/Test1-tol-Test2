package AutosFeladat;

public class Tire {
    private double pressure = 0;
     boolean hasHole = false;


    public void givePressure() {

        if (Math.random() * 100 <= 5) {
            hasHole = true;
        } else {
            pressure =(Math.random()*3);

        }
    }

    public void pump() {
        if (!hasHole) {
            pressure = 3;
        }
    }

    public void fixHole() {
        hasHole = false;
    }
}
