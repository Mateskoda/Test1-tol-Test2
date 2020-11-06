package progmatic;

import java.util.ArrayList;

public class Ship {
    Pirates captain;
    Pirates crew;
    ArrayList<Pirates> ship;

    public Ship() {
        this.ship = new ArrayList<Pirates>();

    }

    public void fillShip() {
        captain = new Pirates();
        ship.add(captain);
        Pirates crew = new Pirates();

        int r = (int) (Math.random() * 50);
        for (int i = 0; i < r; i++) {
            ship.add(crew);

        }
    }

    public int cntDeadPirates() {
        int cntDeath = 0;
        for (int i = 1; i < ship.size(); i++) {
            if (ship.get(i).deathOrNot == true) {
                cntDeath++;
            }
        }
        return cntDeath;
    }

    public void represent() {
        if (captain.deathOrNot) {
            System.out.println("The captain is dead.");
        } else if (captain.passedOut) {
            System.out.println(" The Captain passed out.");
        } else {
            System.out.println("Captains rumlevel is" + captain.alcoholLevel);
        }
        System.out.println("Ship members =" + ship.size());
        int alivePirates = ship.size() - 1 - cntDeadPirates();
        System.out.println("The number of alive pirates in the crew is  " + alivePirates);

    }

    public int calculator() {
        int score = ship.size() - captain.alcoholLevel;
        return score;
    }

    public boolean battle(Ship otherShip) {
        if (this.calculator() > otherShip.calculator()) {
            for (int i = 0; i < otherShip.ship.size()*Math.random(); i++) {
                //if (Math.random() < 0.1) {
                    otherShip.ship.get(i).deathOrNot = true;

            }
            for (int i = 0; i < ship.size(); i++) {
                ship.get(i).alcoholLevel = (int) (Math.random() * 4 + 1);
            }
            return true;

        } else {
            for (int i = 0; i < ship.size()*Math.random() ;i++) {
                //if (Math.random() < 0.1) {
                    ship.get(i).deathOrNot = true;

            }
            for (int i = 0; i < ship.size(); i++) {
                otherShip.ship.get(i).alcoholLevel = (int) (Math.random() * 4 + 1);
            }
            return false;

        }
    }
}

/*



 */
