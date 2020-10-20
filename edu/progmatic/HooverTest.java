package edu.progmatic;

import java.util.Scanner;

public class HooverTest {
    public static void main(String[] args) {
        int cnt = 0;
        Hoover hoover1 = new Hoover();
        System.out.println("Add meg ,hogy mennyire poros a szoba(nagyon,kicsit,közepesen)");
        Scanner sc = new Scanner(System.in);
        String dustAmount = sc.nextLine();
        System.out.println("Add meg ,hogy mennyire gyorsan fogsz takarítani(gyorsan,lassan,közepesen)");
//        Scanner sc = new Scanner(System.in);
        String speed = sc.nextLine();
        while (cnt == 0) {
            System.out.println("szeretnél porszívózni ? (I/N)");
            String doOrNot = sc.nextLine();
            if (doOrNot.equals("N")) {
                System.out.println("mára ennyi");
                break;
            }
            if (!doOrNot.equals("I")) {
                System.out.println("dönts I és N között");
            } else {
                System.out.println("ha be  szeretnéd szúrni a dugót ,nyomj egy I-t ");
                String plug = sc.nextLine();
                while (!plug.equals("I")) {
                    System.out.println("Ebből így nem lesz porszívózás.Én nyomnék egy I -t a helyedben");
                    String plug2 = sc.nextLine();
                    plug = plug2;
                }
                if (plug.equals("I")) {
                    hoover1.isPlugIn();
                }

                System.out.println("ha  be szeretnéd kapcsolni a porszívót, nyomj egy I-t ");
                String electricity = sc.nextLine();
                while (!electricity.equals("I")) {
                    System.out.println("Ebből így nem lesz porszívózás.Én nyomnék egy I -t a helyedben");
                    String electricity2 = sc.nextLine();
                    electricity = electricity2;
                }
                if (electricity.equals("I")) {
                    hoover1.turnOnOrOff();
                }
                hoover1.hoovering(speed, dustAmount);
                System.out.println("Eddig " +(int)hoover1.min + " percig porszívóztál,megtelt a porszívód porral. Még "+(int)hoover1.house+ " egységnyi por maradt a házban");

                System.out.println("ha még porszívózni szeretnél, nyomj egy I-t ,ha nem ,nyomj egy N-t");
                String oneMore = sc.nextLine();
                if (oneMore.equals("N")) {
                    System.out.println("Mára ennyi volt");
                    cnt++;
                } else {
                    System.out.println("cseréld ki a porzsákot!");

                    System.out.println("ha ki szeretnéd kapcsolni a porszívót, nyomj egy I-t ");
                    String electricity2 = sc.nextLine();
                    while (!electricity2.equals("I")) {
                        System.out.println("Ebből így nem lesz porzsákcsere.Én nyomnék egy I -t a helyedben");
                        String electricity3 = sc.nextLine();
                        electricity2 = electricity3;
                    }
                    if (electricity2.equals("I")) {
                        hoover1.turnOnOrOff();
                    }

                    System.out.println("ha ki szeretnéd húzni a dugót ,nyomj egy I-t ");
                    String plug2 = sc.nextLine();
                    while (!plug2.equals("I")) {
                        System.out.println("Ebből így nem lesz porzsákcsere.Én nyomnék egy I -t a helyedben");
                        String plug3 = sc.nextLine();
                        plug2 = plug3;
                    }
                    if (plug2.equals("I")) {
                        hoover1.isPlugIn();

                    }
                    System.out.println("Most már kicserélheted a porzsákot.Ha kicserélted,nyomj egy I-t");
                    String change = sc.nextLine();
                    while (!change.equals("I")) {
                        System.out.println("Így nehéz lesz folytatni a porszívózást.Én nyomnék egy I -t a helyedben");
                        String change2 = sc.nextLine();
                        change = change2;
                    }
                    System.out.println("");

                }
            }
        }
    }
}