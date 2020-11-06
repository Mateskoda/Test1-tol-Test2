package progmatic;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Boxers {
    static ArrayList<Boxer> boxers = new ArrayList<Boxer>();

    public Boxers() {
    }

    //
    public static void main(String[] args) throws FileNotFoundException {
//    ArrayList<Boxer> boxers = new ArrayList<Boxer>();
        Scanner sc = new Scanner(new File("boxers.txt"));

        for (int i = 0; sc.hasNext(); i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            String nationality = parts[1];
            int weight = Integer.parseInt(parts[2]);
            int oneDayLossOfWeight = Integer.parseInt(parts[3]);
            int maxLossOfWeight = Integer.parseInt(parts[4]);
            Boxer b = new Boxer(name, nationality, weight, oneDayLossOfWeight, maxLossOfWeight);
            boxers.add(b);

        }

        int[] weightCategories = {52, 57, 63, 71, 79, 91};
//    1. Mennyi a magyar boxolók átlagos testsúlya?
        System.out.println("1. Mennyi a magyar boxolók átlagos testsúlya? " + avgKgs());
//    2. Hány kg-s a legnehezebb boxoló?
        System.out.println(" 2. Hány kg-s a legnehezebb boxoló? " + maxWeight());

//     3. Egy adott boxoló mely súlycsoportban boxol? (Tipp: boxoló osztályod tartalmazzon egy

//        System.out.println("3. Egy adott boxoló mely súlycsoportban boxol?  " + whichWeightClass());


        System.out.println(cntBoxersInClass());

        System.out.println(boxersOfWeightCategories());

//        System.out.println( oneMatch(2));
        allMatch();
//        boxerWinWithoutMatch();
//        8. Van-e olyan súlycsoport, ahol garantált a magyar aranyérem (mert csak magyarok
//            indulnak)? Ha igen melyek ezek?
        matchesWithHunGold();
//        9. Hány azonos súlyú angol boxoló van? Írd ki a súlyukat!
        System.out.println(englishEqualWeight());
//        10. Írd ki, hogy a legnagyobb súlycsoportban milyen mérkőzések lesznek (hogy melyik
//boxolók küzdenek egymással).
        biggestMenMatches();

//            11. Ha a versenyig n nap van hátra egy adott boxoló mely súlycsoportokban indulhat? (Tipp:
//    boxoló osztályod tartalmazzon egy public ArrayList&lt;Integer&gt;
//    myPossibleWeightCategories(int daysToTournament) metódust!)
//        System.out.println(boxers.get(1).myMinWeight(10));
        System.out.println(boxers.get(1).myPossibleWeightCategories(10));
        System.out.println(boxers.get(0).myPossibleWeightCategories(10));
        System.out.println(boxers.get(0).myPossibleWeightCategories(10));
        boxers.get(0).myMinWeight(10);
        System.out.println(boxers.get(0).getActuelWeight());
        System.out.println(boxers.get(0).myPossibleWeightCategories(10));
        boxers.get(0).myMinWeight(10);
        System.out.println(boxers.get(0).getActuelWeight());


        twoDays();
    }

    //  1. Mennyi a magyar boxolók átlagos testsúlya?
    public static double avgKgs() {
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < boxers.size(); i++) {
            if (boxers.get(i).getNationality().equals("hu")) {
                sum += boxers.get(i).getWeight();
                cnt++;
            }
        }
        return (double) sum / boxers.size();
    }

    //     2. Hány kg-s a legnehezebb boxoló?
    public static int maxWeight() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < boxers.size(); i++) {
            if (boxers.get(i).getWeight() > max) {
                max = boxers.get(i).getWeight();
            }
        }
        return max;
    }

    //     3. Egy adott boxoló mely súlycsoportban boxol? (Tipp: boxoló osztályod tartalmazzon egy
    public static int whichWeightClass() {
        System.out.println("Kérlek add meg, melyik boxoló súlycsoportjára vagy kíváncsi(pl.John Little,Donald Duck,Tiny Fist)");
        Scanner sc = new Scanner(System.in);
        String nameOfBoxer = sc.nextLine();
        for (int i = 0; i < boxers.size(); i++) {
            if (boxers.get(i).getName().equals(nameOfBoxer)) {
                return boxers.get(i).myWeightCategory();
            }
        }
        return -1;
    }

// 4. Hányan boxolnak az egyes súlycsoportokban?

    public static HashMap<Integer, Integer> cntBoxersInClass() {
        HashMap<Integer, ArrayList<Boxer>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<Boxer>());

            boxersInClass.get(b.myWeightCategory()).add(b);

        }
        HashMap<Integer, Integer> numBoxersInClass = new HashMap<>();
        for (Map.Entry<Integer, ArrayList<Boxer>> bEntry : boxersInClass.entrySet()) {
            numBoxersInClass.putIfAbsent(bEntry.getKey(), bEntry.getValue().size());
        }

//    Iterator<Map.Entry<Integer,ArrayList<Boxer>>> it = boxersInClass.entrySet().iterator();
//
//    while (it.hasNext()) {
//        Map.Entry<Integer,ArrayList<Boxer>> pair = it.next();
//       int x= pair.getValue().size();
//       boxersInClass.put(pair.getKey(), )
//        }
//    }
        return numBoxersInClass;
    }

    // 5. Kik boxolnak az egyes súlycsoportokban? (Tipp: írj metódust a következő szignatúrával:
    public static HashMap<Integer, ArrayList<String>> boxersOfWeightCategories() {
        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());

            boxersInClass.get(b.myWeightCategory()).add(b.name);

        }
        return boxersInClass;
    }

    //    Írd ki, hogy súlycsoportonként milyen mérkőzések lesznek (hogy melyik boxolók
//            küzdenek egymással).
    public static HashMap<Integer, ArrayList<String>>
    oneMatch(int classOfBoxers) {
        System.out.println();
        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            if (b.myWeightCategory() == classOfBoxers) {
                boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<>());
                boxersInClass.get(b.myWeightCategory()).add(b.name + "   ");
            }
        }
        if (!boxersInClass.containsKey(classOfBoxers)) {
            System.out.println("nincs boxoló ebben a súlycsoportban.");
        } else if (boxersInClass.get(classOfBoxers).size() == 1) {
            System.out.println("csak egy boxoló van ebben a súlycsoportban");
        } else {
            for (int i = 0; i < boxersInClass.get(classOfBoxers).size() - 1; i++) {
                String name1 = boxersInClass.get(classOfBoxers).get(i);

                for (int j = i + 1; j < boxersInClass.get(classOfBoxers).size(); j++) {
                    System.out.println(name1 + " contra " + boxersInClass.get(classOfBoxers).get(j));
                }
            }
        }
        for (int i = 0; i < boxersInClass.size(); i++) {
            if (!boxersInClass.containsKey(i)) {
            } else if (boxersInClass.get(i).size() == 1) {
                System.out.println("csak egy boxoló van a " + i + 1 + " súlycsoportban");
            }
        }
        for (Map.Entry<Integer, ArrayList<String>> integerArrayListEntry : boxersInClass.entrySet()) {

        }
        return boxersInClass;


    }

    //      6. Írd ki, hogy súlycsoportonként milyen mérkőzések lesznek (hogy melyik boxolók
//            küzdenek egymással).
//            súlycsoportjában)?
    public static void allMatch() {
        System.out.println();

        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());

            boxersInClass.get(b.myWeightCategory()).add(b.name);

        }
        for (Integer integer : boxersInClass.keySet()) {

//        }
//        for (int i = 1; i < 8; i++) {
            if (!boxersInClass.containsKey(integer)) {
                System.out.println("nincs boxoló ebben a súlycsoportban.");
            } else if (boxersInClass.get(integer).size() == 1) {
                System.out.println(boxersInClass.get(integer).get(0) + "  egyedül szerepel a csoportban");
            } else {
                for (int k = 0; k < boxersInClass.get(integer).size() - 1; k++) {
                    String name1 = boxersInClass.get(integer).get(k);

                    for (int j = k + 1; j < boxersInClass.get(integer).size(); j++) {
                        System.out.println(name1 + " contra " + boxersInClass.get(integer).get(j));
                    }
                }
            }
        }
    }
//                7. Van-e olyan boxoló, aki mérkőzés nélkül is nyerni fog (mert egyedül van a

    public static void boxerWinWithoutMatch() {
        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());

            boxersInClass.get(b.myWeightCategory()).add(b.name);

        }
        for (int i = 0; i < 10; i++) {
            if (!boxersInClass.containsKey(i)) {
            } else if (boxersInClass.get(i).size() == 1) {
                System.out.println("csak egy boxoló van a " + i + ". súlycsoportban");
            }
        }


    }

    //    8. Van-e olyan súlycsoport, ahol garantált a magyar aranyérem (mert csak magyarok
//            indulnak)? Ha igen melyek ezek?
    public static void matchesWithHunGold() {
        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());

            boxersInClass.get(b.myWeightCategory()).add(b.getNationality());

        }
        for (int i = 0; i < 10; i++) {
            if (!boxersInClass.containsKey(i)) {
            } else {
                int cnt = 0;
                for (int j = 0; j < boxersInClass.get(i).size(); j++) {
                    if (boxersInClass.get(i).get(j).equals("hu")) {
                        cnt++;
                    }
                }

                if (cnt == boxersInClass.get(i).size()) {
                    System.out.println("biztos a magyar győzelem a " + i + ". súlycsoportban");
                }
            }
        }


    }

    // 9. Hány azonos súlyú angol boxoló van? Írd ki a súlyukat!
    public static int englishEqualWeight() {
        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.getWeight(), new ArrayList<String>());
//            ArrayList weightAndNationality = new ArrayList();
//            weightAndNationality.add(b.getWeight());
//            weightAndNationality.add(b.getNationality());
            if (b.getNationality().equals("fr")) {
                boxersInClass.get(b.getWeight()).add(b.getNationality());
            }
        }
        System.out.println(boxersInClass);
        int cnt = 0;
        for (Integer integer : boxersInClass.keySet()) {
            if (!boxersInClass.containsKey(integer)) {
            } else if (boxersInClass.get(integer).size() > 1) {
                cnt++;
//        for (Integer i : boxersInClass.keySet()) {
                System.out.println(integer + "  " + boxersInClass.get(integer));
//        }

            }
        }
        return cnt;

    }

    //  10. Írd ki, hogy a legnagyobb súlycsoportban milyen mérkőzések lesznek (hogy melyik
//boxolók küzdenek egymással).
    public static void biggestMenMatches() {
        System.out.println();

        HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();
        for (Boxer b : boxers) {
            boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());

            boxersInClass.get(b.myWeightCategory()).add(b.name);

        }
        int biggestClass = Integer.MIN_VALUE;
        for (Integer integer : boxersInClass.keySet()) {
            if (integer > biggestClass) {
                biggestClass = integer;
            }
        }
        biggestClass = 6;
        if (!boxersInClass.containsKey(biggestClass)) {
            System.out.println("nincs boxoló ebben a súlycsoportban.");
        } else if (boxersInClass.get(biggestClass).size() == 1) {
            System.out.println(boxersInClass.get(biggestClass).get(0) + "  egyedül szerepel a csoportban");
        } else {
            for (int k = 0; k < boxersInClass.get(biggestClass).size() - 1; k++) {
                String name1 = boxersInClass.get(biggestClass).get(k);

                for (int j = k + 1; j < boxersInClass.get(biggestClass).size(); j++) {
                    System.out.println(name1 + " contra " + boxersInClass.get(biggestClass).get(j));

                }
            }
        }
    }

//            11. Ha a versenyig n nap van hátra egy adott boxoló mely súlycsoportokban indulhat? (Tipp:
//    boxoló osztályod tartalmazzon egy

    //      12. Ha tudjuk, hogy két nap van a versenyig van-e olyan boxoló, aki megfelelő fogysztással
//    biztos győztes lehet (mert egyedül lesz a fogyasztás utáni súlycsoportjában)?
//    Az egyszerűsítés miatt tegyük fel, hogy a versenyig minden versenyző a tőle telhető
//    maximális mennyiséget próbál fogyni, kivéve akit vizsgálunk épp, mert ő “okoskodhat” a
//    fogyásával, ha az neki épp úgy kedvező.
    public static void twoDays() {

        ArrayList<String> namesWhoWin = new ArrayList<>();
        for (Boxer boxer : boxers) {
            HashMap<Integer, ArrayList<String>> boxersInClass = new HashMap<>();

            for (Boxer b : boxers) {
                b.myMinWeight(2);
                if (b == boxer) {
                    boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());
                    boxersInClass.get(b.myWeightCategory()).add(b.name);
                    b.setActuelWeight(b.getActuelWeight() + 1 * b.getOneDayLossOfWeight());
                    if (boxersInClass.containsKey(b.myWeightCategory())) {
                    } else {
                        boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());
                        boxersInClass.get(b.myWeightCategory()).add(b.name);
                    }
                    b.setActuelWeight(b.getWeight() );
                    if (boxersInClass.containsKey(b.myWeightCategory())) {
                    } else {
                        boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<String>());
                        boxersInClass.get(b.myWeightCategory()).add(b.name);
                    }
                } else {
                    boxersInClass.putIfAbsent(b.myWeightCategory(), new ArrayList<>());
                    boxersInClass.get(b.myWeightCategory()).add(b.name);

                }
            }
            System.out.println(boxersInClass);
            for (Integer integer : boxersInClass.keySet()) {
                if (boxersInClass.get(integer).size() == 1) {
//                    if (namesWhoWin.contains(boxersInClass.get(integer).get(0))) {
                        namesWhoWin.add(boxersInClass.get(integer).get(0));
//                    }
//                System.out.println(boxersInClass.get(integer).get(0)+" egyedül lesz a csoportjában,így biztosan győz");
                }
            }
        }
        System.out.println(namesWhoWin);
        HashSet<String> namesWinner = new HashSet<>(namesWhoWin);
        System.out.println(namesWinner);
    }

}


//    Boxolók
//
//    John Little, en, 73, 1, 3
//    Donald Duck, en, 82,0,0
//    Tiny Fist, en, 64, 0, 0
//    John Rambo, en, 92, 2, 4
//    Jean-Paul Belmondo, fr, 85, 1, 4
//    Bonaparte Poign Napoleon, fr, 64, 0, 0
//    Jean-Michelle Longbras, fr, 64 , 1, 3
//    Arany Áron, hu, 54, 1, 2
//    Bekő Tóni, hu, 71,2,2
//    Csinál Tamás, hu, 89,2,3
//    Csókoló Zoltán, hu, 77,1,4
//    Ének Elek, hu, 56,1,1
//    Fa Jankó, hu, 72,3,3
//    Futaki Bátor, hu, 81,2,5
//private int[] weightCategories = {52, 57, 63, 71, 79, 91};

//    Az első sor pl. azt jelenti, hogy Little John angol, 73 kg és egy nap alatt 1 kg-t tud ledobni, de
//    max 3 kg-t tud fogyni (tehát akárhány napig fogyaszt nem fog tudni 70 kg alá menni).
//    Ez a tömb a következő módon értelmezendő. A 0. súlycsoport 0 és 52 kg közötti (aki pont 52 kg
//            az még ide tartozik), az 1. súlycsoport 52 és 57 kg közötti (ha 52 &lt; súly &lt;= 57, akkor tartozik ide
//            egy boxoló), stb…
//    Egy mérkőzésen az összes boxoló részt vesz. Mindenki boxol mindenkivel, aki vele egy
//    súlycsoportban van.
//    Írj programot, ami válaszol az alábbi kérdésekre:

//
//
//
//
//
//
//    TreeMap&lt;K, V&gt; olyan Map implementáció, amely a kulcs szerinti rendezésben tartja az
//    elemeket (Integerekre: növekvő sorrend, Stringekre: ABC-sorrend).
