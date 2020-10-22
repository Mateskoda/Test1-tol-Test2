package AutosFeladat;

public class Engine {
    private int oillevel;
    private boolean isDiesel;

    public Engine() {

        oillevel = (int) (Math.floor(Math.random() * 50) + 50);
        isDiesel = Math.random()<0.5;
    }

    public int getOillevel() {
        return oillevel;
    }

    public boolean isDiesel() {
        return isDiesel;
    }


    public boolean fillOil() {
        oillevel = 100;
        return true;

    }
}
