package progmatic;

import java.util.Scanner;

public class BicikliTest {
    double speed;
    double fordulat;

    public static void main(String[] args) {
        Bicikli bico = new Bicikli();
        System.out.println("add meg a fokozatot");
        Scanner sc = new Scanner(System.in);
        int fokozat = sc.nextInt();
        System.out.println("add meg, hogy sebességet vagy fordulatot szeretnél számolni (s/f)");
        Scanner sc2 = new Scanner(System.in);
        String választás = sc2.nextLine();
        if (választás.equals("s")) {
            System.out.println("add meg a fordulatodat");
            double fordulat = sc.nextInt();
            bico.setValto(fokozat);
            System.out.println("a te sebességed " + bico.getSpeed(fordulat));
        }
        if (választás.equals("f")) {
            System.out.println("add meg a sebességedet");
            double sebesség = sc.nextDouble();
            bico.setValto(fokozat);
            System.out.println("a te fordulatod  " + bico.getFordulatPerSec(sebesség));
        }
    }

    public double getSpeed() {
        return speed;
    }

    public double getFordulat() {
        return fordulat;
    }
}
