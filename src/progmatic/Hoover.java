package progmatic;

public class Hoover {

    int capacity = 20;
    boolean electricity = false;
    boolean plugIn = false;
//    int dustInTheHoover = 0;
    double countMinutes = 0;
    double houseSqM = 100;
    double speed;
    double dustAmount;

    public boolean isPlugIn() {
        if (plugIn) {
            return false;
        } else {
            return true;
        }
    }

    public boolean turnOnOrOff() {
        if (electricity) {
            return false;
        } else {
            return true;
        }
    }

    public double hoovering(String speed, String dustAmount) {
        if (speed.equals("lassan")) {
            this.speed = 0.8;
        }
        if (speed.equals("közepesen")) {
            this.speed = 1;
        }
        if (speed.equals("gyorsan")) {
            this.speed = 1.2;
        }
        if (dustAmount.equals("kicsit")) {
            this.dustAmount = 0.5;

        }
        if (dustAmount.equals("közepesen")) {
            this.dustAmount = 1;

        }
        if (dustAmount.equals("nagyon")) {
            this.dustAmount = 1.5;
        }
        countMinutes += (capacity / this.dustAmount) / this.speed;
        houseSqM -= capacity / this.dustAmount;
        if (houseSqM < 0) {
            System.out.println("fejezd be, ez már tisztaságmánia");
        }
        return countMinutes;
    }
}
