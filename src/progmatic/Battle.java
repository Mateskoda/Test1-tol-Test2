package progmatic;

public class Battle {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship2.fillShip();
        ship1.represent();
        ship2.represent();
        ship1.battle(ship2);
        ship1.represent();
        ship2.represent();
    }
}
