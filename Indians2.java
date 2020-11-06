import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Indians2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("indianok.txt"));
        int cnt = 0;
        for (int i = 0; sc.hasNextLine(); i++) {
            sc.nextLine();
            cnt++;
        }
        String[][] indians = new String[cnt][5];
        List<String> indianEquipments = new ArrayList<>();
        Scanner sc2 = new Scanner(new File("indianok.txt"));

        for (int i = 0; sc2.hasNextLine(); i++) {
            String line = sc2.nextLine();
            String[] parts = line.split(",");
            indians[i][0] = parts[0];
            indians[i][1] = parts[1];
            indians[i][2] = parts[2];
            indians[i][3] = parts[3];
            indians[i][4] = parts[4];
        }
        System.out.println(indians[0][4]);
        String[][] parts = new String[indians.length][];

        for (int i = 0; i < indians.length; i++) {
            parts[i] = indians[i][4].split("\\|");
            for (int j = 0; j < parts[i].length; j++) {

                indianEquipments.add(parts[i][j]);
            }
        }
//                indians[i][2] = Integer.parseInt(parts[2]);
//
//                indians.add(parts[1]);
//                indians.add(parts[2]);
//                indians.add(parts[3]);
//                indians.add(parts[4]);

//                indians[i][2] = Integer.parseInt(parts[2]);
//                indians[i][3] = Integer.parseInt(parts[3]);
//                [i] = parts[4];


        for (int i = 0; i < indians.length; i++) {
            System.out.println(indians[i][0]);
//        }

        }
//        Hány indián szerepel a leltárban?
        System.out.println("1.Hány indián szerepel a listán?  " + indians.length);
//        Hány különböző eszköz szerepel a leltárban?
        System.out.println(indianEquipments);
        HashSet<String> set = new HashSet<>(indianEquipments);
        System.out.println(set);
        System.out.println(" Hány különböző eszköz szerepel a leltárban?  " + set.size());
//        Hányan vannak egy adott indián törzsben?
        System.out.println("Hányan vannak egy adott indián törzsben?  " + cntIndiansInColective(indians, "Apache"));
//        Milyen a férfi arány a Seminole törzsben?
        System.out.println(menRate(indians, "Seminole"));
//        Kik alkotják a vének tanácsát az apache törzsben?
        System.out.println("Kik alkotják a vének tanácsát az apache törzsben?  " + oldMen(indians, parts));
        //    Átlagosan hány tulajdona van egy indiánnak?
        System.out.println("Átlagosan hány tulajdona van egy indiánnak?" + avgEquipments(indians, parts));
//        Hány indiánnak van íja?
        System.out.println(" Hány indiánnak van íja?" + hasBow(parts));
        System.out.println("Hány mezítlábas indián van? Mennyi az átlagéletkoruk?" + noMokaszins(parts, indians));
//
//    Map-et igénylő feladatok:
//
//
//
//    Mely törzs gyerekeinek van a legtöbb tulajdona
//    (gyerek az, aki 18 év alatti).
//    Írd ki, hogy törzsenként mennyi van az egyes eszközökből!
//
        HashMap<String, Integer> map1 = new HashMap<>();
//        Melyik indián törzsben vannak a legtöbben?
        System.out.println("Melyik indián törzsben vannak a legtöbben?  "+ maxClan(map1,indians));
//        Milyen a férfi arány az egyes indián törzseknél?
        System.out.println("Milyen a férfi arány az egyes indián törzseknél?   "+ menContra(indians));
//        Melyik törzsben van a legtöbb férfinak tomahawkja?
        tomahawkForMen( indians, parts);
//        Mely törzs gyerekeinek van a legtöbb tulajdona
//    (gyerek az, aki 18 év alatti).
//    Írd ki, hogy törzsenként mennyi van az egyes eszközökből!
        stuffOfChildren(indians, parts);
    }

    //    public static String maxMap (HashMap<String,Integer> map){
//        int max = Integer.MIN_VALUE;
//    }

    public static String maxClan(HashMap map1, String[][] indians) {
        int max = Integer.MIN_VALUE;
        String maxClan = "0";
        for (int i = 0; i < indians.length; i++) {
            if (map1.containsKey(indians[i][1])) {

            } else {
                map1.put(indians[i][1], cntIndiansInColective(indians, indians[i][1]));
            }
        }
        Iterator<Map.Entry<String, Integer>> it = map1.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            if (pair.getValue() > max) {
                max = pair.getValue();
                maxClan = pair.getKey();
            }
        }
        System.out.println(map1);
        System.out.println(max + maxClan);
        return maxClan;
    }

    public static int tomahawkCntForMen(String[][] equipments, String[][] indians, String collective) {
        int cnt = 0;
        for (int i = 0; i < indians.length; i++) {
            if (indians[i][1].equals(collective) && indians[i][2].equals("f"))
                for (int j = 0; j < equipments[i].length; j++) {
                    if (equipments[i][j].equals("tomahawk")) {
                        cnt++;
                    }
                }
        }
        return cnt;
    }

    public static HashMap<String, Integer> tomahawkForMen(String[][] indians, String[][] equipments) {
        HashMap<String, Integer> tomahawk = new HashMap<>();

        for (int i = 0; i < indians.length; i++) {
            if (tomahawk.containsKey(indians[i][1])) {

            } else {
                tomahawk.put(indians[i][1], tomahawkCntForMen(equipments, indians, indians[i][1]));
            }
        }
        Iterator<Map.Entry<String, Integer>> it = tomahawk.entrySet().iterator();
        int max = Integer.MIN_VALUE;
        String maxClan = "0";
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            if (pair.getValue() > max) {
                max = pair.getValue();

            }
        }
        Iterator<Map.Entry<String, Integer>> it2 = tomahawk.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<String, Integer> pair = it2.next();
            if (pair.getValue() == max) {
                System.out.println(max + pair.getKey());
            }
        }
        System.out.println(tomahawk);
//        System.out.println(max + );

        return tomahawk;
    }

    public static int stuffCntForChildren(String[][] equipments, String[][] indians, String collective) {
        int sum = 0;
        for (int i = 0; i < indians.length; i++) {
//            int age = Integer.parseInt(indians[i][3]);
            if (indians[i][1].equals(collective) && Integer.parseInt(indians[i][3]) < 18) {
                sum += equipments[i].length;
            }
        }
        return sum;
    }

    public static HashMap<String, Integer> stuffOfChildren(String[][] indians, String[][] equipments) {
        HashMap<String, Integer> stuff = new HashMap<>();
//        stuff.put(indians[0][1], stuffCntForChildren(equipments, indians, indians[0][1]));

        for (int i = 1; i < indians.length; i++) {
            if (stuff.containsKey(indians[i][1])) {

            } else {
                stuff.put(indians[i][1], stuffCntForChildren(equipments, indians, indians[i][1]));
            }
        }
        Iterator<Map.Entry<String, Integer>> it = stuff.entrySet().iterator();
        int max = Integer.MIN_VALUE;
        String maxClan = "0";
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            if (pair.getValue() > max) {
                max = pair.getValue();

            }
        }
        Iterator<Map.Entry<String, Integer>> it2 = stuff.entrySet().iterator();

        while (it2.hasNext()) {
            Map.Entry<String, Integer> pair = it2.next();
            if (pair.getValue() == max) {
                System.out.println(max + pair.getKey());
            }
        }
        System.out.println(stuff);
//        System.out.println(max + );

        return stuff;
    }

    public static HashMap<String, Double> menContra(String[][] indians) {
        HashMap<String, Double> menContra = new HashMap<>();
        for (int i = 0; i < indians.length; i++) {
            if (menContra.containsKey(indians[i][1])) {

            } else {
                menContra.put(indians[i][1], menRate(indians, indians[i][1]));
            }
        }
        return menContra;
    }


    public static int cntIndiansInColective(String[][] indians, String collective) {
        int cnt = 0;
        for (int i = 0; i < indians.length; i++) {
            if (indians[i][1].equals(collective)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static double menRate(String[][] indians, String collective) {
        int cntM = 0;
        int cntW = 0;
        for (int i = 0; i < indians.length; i++) {
            if (indians[i][1].equals(collective) && indians[i][2].equals("f")) {
                cntM++;
            }
            if (indians[i][1].equals(collective) && indians[i][2].equals("n")) {
                cntW++;
            }
        }
        return (double) cntM / cntW;

    }

    public static int oldMen(String[][] indians, String[][] parts) {
        int cnt = 0;
        for (int i = 0; i < indians.length; i++) {
            if (indians[i][1].equals("Apache")) {
                for (int j = 0; j < parts[i].length; j++) {
                    if (parts[i][j].equals("békepipa")) {
                        cnt++;
                    }
                }
            }

        }
        return cnt;

    }

    public static double avgEquipments(String[][] indians, String[][] equipments) {
        int sum = 0;
        for (int i = 0; i < equipments.length; i++) {
            sum += equipments[i].length;
        }
        return (double) sum / indians.length;
    }

    public static int hasBow(String[][] equipments) {
        int cnt = 0;
        for (int i = 0; i < equipments.length; i++) {
            for (int j = 0; j < equipments[i].length; j++) {
                if (equipments[i][j].equals("íj")) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }

    public static int noMokaszins(String[][] equipments, String[][] indians) {
        int sumAge = 0;
        int cnt = 0;
        for (int i = 0; i < equipments.length; i++) {
            for (int j = 0; j < equipments[i].length; j++) {
                if (equipments[i][j].equals("mokaszin")) {
                    sumAge += Integer.parseInt(indians[i][3]);
                    cnt++;
                }
            }
        }
//        System.out.println(sumAge);
        System.out.println(sumAge / (equipments.length - cnt));
        return equipments.length - cnt;
    }
}

