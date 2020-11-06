package progmatic;

public class Pirates {
    int alcoholLevel = 0;
    boolean deathOrNot;
    boolean passedOut;

    public void drinkSomeRum() {
        if (deathOrNot) {
            System.out.println("He is death");
        }
        alcoholLevel++;
    }

    public void howsItGoingMate() {

        if (deathOrNot) {
            System.out.println("He is death");
        } else if (alcoholLevel <= 4) {
            System.out.println("Pour me anudder");
        } else {
            System.out.println("Ardhh,I'ma Pirate.How d'ya d'ink its goin?");
            alcoholLevel = 0;
        }
    }

    public void die() {
        deathOrNot = true;
    }

    public void brawl(Pirates other) {
        if (Math.random() < 0.33) {
            this.die();
        } else if (Math.random() < 0.66) {
            other.die();
        } else {
            this.passedOut=true;
            other.passedOut=true;

        }
    }
}

