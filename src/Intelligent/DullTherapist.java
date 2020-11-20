package Intelligent;

public class DullTherapist implements IntelligentBeing {
    @Override
    public void response(String input, IntelligentBeing i) {
//        Készíts egy DullTherapist osztályt, ami az alábbi válaszokat ismételgeti véletlenszerűen: (
        double random = Math.random();
        if (random < 0.2) {
            System.out.println("Kérem, folytassa");
        } else if (random < 0.5) {
            System.out.println("Biztos ebben?");
        } else if (random < 0.7) {
            System.out.println("Csakugyan?");
        } else {

            System.out.println("Nem tudom. Talán így van. Ön mit gondol erről?");

        }
    }
}
