package SuspectSimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Police {

    static List<Suspect> suspects = new ArrayList<>();
    static Map<Suspect, Integer> statisticts = new HashMap<>();

    public static void main(String[] args) {
        Naiv naiv = new Naiv("naiv");
        BadGuy badGuy = new BadGuy("badguy");
        BadGuy badGuy2 = new BadGuy("badguy2");
        BadGuy badGuy3 = new BadGuy("badguy3");
        BadGuy badGuy4 = new BadGuy("badguy4");
        BadGuy badGuy5 = new BadGuy("badguy5");
        Sértödékeny sértödékeny = new Sértödékeny("sértődékeny");
        suspects.add(naiv);
        suspects.add(badGuy);
        suspects.add(badGuy2);
        suspects.add(badGuy3);
//suspects.add(badGuy4);
//        suspects.add(badGuy5);
        suspects.add(sértödékeny);
        System.out.println(sértödékeny.punishment);
        System.out.println(naiv.punishment);
        System.out.println(badGuy.punishment);
        simulate();
        System.out.println(sértödékeny.punishment);
        System.out.println(naiv.punishment);
        System.out.println(badGuy.punishment);
//        investigate();
    simulate();
    simulate();
    simulate();
    simulate();
    simulate();
    simulate();
        System.out.println(sértödékeny.punishment);
        System.out.println(naiv.punishment);
        System.out.println(badGuy.punishment);

    }

    public static void simulate() {
        investigate();
    }

    public static void investigate() {
         statisticts = new HashMap<>();
        for (int i = 0; i < suspects.size(); i++) {
            for (int j = 0; j < suspects.size(); j++) {
                if (!(i == j)) {
                    suspects.get(i).setPunishment(suspects.get(j));
//                    System.out.println("1");
                }
            }
        }
        for (int i = 0; i < suspects.size(); i++) {
            statisticts.putIfAbsent(suspects.get(i), 0);
            for (int j = 0; j < suspects.size(); j++) {
                if (!(i == j)) {
                    int integer = statisticts.get(suspects.get(i));
                    if (!(((SuspectProfile) suspects.get(i)).cooperations.isEmpty())) {
                        if (((SuspectProfile) suspects.get(i)).cooperations.containsKey(suspects.get(j))) {
                            integer += (((SuspectProfile) suspects.get(i)).cooperations.get(suspects.get(j)));
                        }
                    }
                    if (!(((SuspectProfile) suspects.get(i)).noncooperations.isEmpty())) {
                        if (((SuspectProfile) suspects.get(i)).noncooperations.containsKey(suspects.get(j))) {

                            integer += (((SuspectProfile) suspects.get(i)).noncooperations.get(suspects.get(j)));
                        }
                    }

                    statisticts.put(suspects.get(i), integer);
//                    System.out.println(statisticts.get(suspects.get(i)));
                }
            }


        }
        System.out.println(statisticts);

    }
}
