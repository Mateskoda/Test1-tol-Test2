import progmatic.TinderUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TinderMain {
  static   ArrayList<TinderUser> userArrayList = new ArrayList<>();
   static ArrayList<String[]> userSwipesArrayList = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("users.txt"));
        for (int i = 0; sc.hasNext(); i++) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            int num = Integer.parseInt(parts[0]);
            String name = parts[1];
            String sex = parts[2];
            int age = Integer.parseInt(parts[3]);
            String hair = parts[4];
            String eye = parts[5];
            TinderUser user = new TinderUser(num, name,sex, age, hair, eye);
            userArrayList.add(user);
        }

        Scanner sc2 = new Scanner(new File("swipes.txt"));
        for (int i = 0; sc2.hasNext(); i++) {
            String line = sc2.nextLine();
            String[] parts = line.split(",");
            userSwipesArrayList.add(parts);
        }
        for (int i = 0; i < userSwipesArrayList.size(); i++) {

            System.out.println(Arrays.toString(userSwipesArrayList.get(i)));
        }

        HashMap<Integer, ArrayList<String[]>> mapOfGivenLikes = new HashMap<>();
        for (String[] strings : userSwipesArrayList) {
            mapOfGivenLikes.putIfAbsent(Integer.parseInt(strings[0]), new ArrayList<String[]>());
            mapOfGivenLikes.get(Integer.parseInt(strings[0])).add(strings);
        }

        for (TinderUser tinderUser : userArrayList) {
            for (Integer integer : mapOfGivenLikes.keySet()) {
                if (integer.equals(tinderUser.getNum())) {
                    for (int i = 0; i < mapOfGivenLikes.get(integer).size(); i++) {
                        if (mapOfGivenLikes.get(integer).get(i)[2].equals("LIKE")) {
                            tinderUser.getGivenLikes().add(mapOfGivenLikes.get(integer).get(i));
                        } else {
                            tinderUser.getGivenDisLikes().add(mapOfGivenLikes.get(integer).get(i));
                        }
                    }
                }
                int cnt = tinderUser.getGivenLikes().size();
                int cnt2 = tinderUser.getGivenLikes().size();
            }
        }
        HashMap<Integer, ArrayList<String[]>> mapOfGotLikes = new HashMap<>();
        for (String[] strings : userSwipesArrayList) {
            mapOfGotLikes.putIfAbsent(Integer.parseInt(strings[1]), new ArrayList<String[]>());
            mapOfGotLikes.get(Integer.parseInt(strings[1])).add(strings);
        }


        for (TinderUser tinderUser : userArrayList) {
            for (Integer integer : mapOfGotLikes.keySet()) {
                if (integer.equals(tinderUser.getNum())) {
                    for (int i = 0; i < mapOfGotLikes.get(integer).size(); i++) {
                        if (mapOfGotLikes.get(integer).get(i)[2].equals("LIKE")) {
                            tinderUser.getGotLikes().add(mapOfGotLikes.get(integer).get(i));
//                            System.out.println("likelike");
                        } else {
                            tinderUser.getGotDisLikes().add(mapOfGotLikes.get(integer).get(i));
//                            System.out.println("dislikedislike");
                        }
                    }
                }
            }
        }


        for (TinderUser tinderUser : userArrayList) {
            for (int i = 0; i < tinderUser.getGivenLikes().size(); i++) {
                System.out.println(Arrays.toString(tinderUser.getGivenLikes().get(i)));
            }
            for (int i = 0; i < tinderUser.getGivenDisLikes().size(); i++) {
                System.out.println(Arrays.toString(tinderUser.getGivenDisLikes().get(i)));
            }
            for (int i = 0; i < tinderUser.getGotLikes().size(); i++) {
                System.out.println(Arrays.toString(tinderUser.getGotLikes().get(i)));
            }
            for (int i = 0; i < tinderUser.getGotDisLikes().size(); i++) {
                System.out.println(Arrays.toString(tinderUser.getGotDisLikes().get(i)));
            }
        }

        System.out.println("mapOfGivenLikes");
        int maxlikes = Integer.MIN_VALUE;
        ArrayList<TinderUser> maxLikesInd = new ArrayList<>();
        for (TinderUser user : userArrayList) {
            if (user.getGotLikes().size() > maxlikes &&user.getSex().equals("FEMALE")) {
                maxlikes = user.getGotLikes().size() - 1;
            }
        }
        for (TinderUser user : userArrayList) {
            if (user.getGotLikes().size()-1 == maxlikes&& user.getSex().equals("FEMALE")) {
                maxLikesInd.add(user);
            }
        }
        System.out.println();

        System.out.println(maxlikes);
        for (int i = 0; i < maxLikesInd.size(); i++) {
            System.out.print(maxLikesInd.get(i).getNum());
            System.out.println(maxLikesInd.get(i).getName());


        }
//        mostSelectiveUser();
//        System.out.println(justLikers());
//        System.out.println(noGotLikes());
//        System.out.println(matches());

        System.out.println(cntBluesMoreBlondeRightThanBrownLeft());
    }
//    Melyik felhasználó a legválogatósabb? (Melyik felhasználónál a legkisebb
//    az az arány, hogy hány felhasználót jelölt szimpatikusnak az összes
//    jelöléséhez képest.)
//    Megoldás: Ha a 0 arányú felhasználókat nem veszed figyelembe, akkor Flóra
public static ArrayList<String> mostSelectiveUser(){
        double selectivity = 100;
        ArrayList<String> minInd = new ArrayList<>();
    for (TinderUser tinderUser : userArrayList) {
        if (tinderUser.getGivenLikes().size()>1 && tinderUser.getGivenDisLikes().size()>1 && ((double)tinderUser.getGivenLikes().size()-1) /(tinderUser.getGivenLikes().size()-1+tinderUser.getGivenDisLikes().size()-1)<selectivity) {

            selectivity = (double)(tinderUser.getGivenLikes().size()-1) / (tinderUser.getGivenLikes().size()-1 + tinderUser.getGivenDisLikes().size()-1);
        }        }
    System.out.println(selectivity);
        for (TinderUser tinderUser : userArrayList) {
            if (selectivity ==(double)(tinderUser.getGivenLikes().size()-1) / (tinderUser.getGivenLikes().size()-1 + tinderUser.getGivenDisLikes().size()-1)) {
                minInd.add(tinderUser.getName());
            }
        }
    System.out.println(minInd);
return minInd;
    }
//    Hány olyan elkeseredett felhasználó volt, aki mindenkit szimpatikusnak jelölt?
//    (Azaz nem volt DISLIKE jelölése, csak LIKE.)
//    Megoldás: 5
//
    public static int justLikers(){
        int cntJustLikers = 0;
        for (TinderUser tinderUser : userArrayList) {
        if (tinderUser.getGivenDisLikes().size()==1 && tinderUser.getGivenLikes().size()>1){
            cntJustLikers++;
        }
    }return cntJustLikers;
    }

//    Hány olyan felhasználó volt, akit senki sem húzott jobbra az alkalmazásban?

//    Megoldás: 4
    public static int noGotLikes(){
        int cntNoGotLikes= 0;
        for (TinderUser tinderUser : userArrayList) {
            if ( tinderUser.getGotLikes().size()==1){
                cntNoGotLikes++;
            }
        }
        return cntNoGotLikes;
    }
    public static int matches (){
        int cntMatches = 0;

        HashSet<String> hashSet = new HashSet<>();
            for (int i = 0; i < userArrayList.size(); i++) {
                for (int j = 1; j < userArrayList.get(i).getGivenLikes().size(); j++) {
                    for (int k = 1; k <userArrayList.get(i).getGotLikes().size() ; k++) {
//                        String string1 = userArrayList.get(i).getGivenLikes().get(j)[1];
//                        String string2 = userArrayList.get(i).getGotLikes().get(k)[0];
//                        System.out.println(string1);
//                        System.out.println(string2);
                        if ( userArrayList.get(i).getGivenLikes().get(j)[1].equals(userArrayList.get(i).getGotLikes().get(k)[0])){
                            String string = userArrayList.get(i).getGivenLikes().get(j)[0]+ " - " +userArrayList.get(i).getGotLikes().get(k)[1];
//                            System.out.println(string);
                            System.out.println();
                            hashSet.add(string);
                        }
            }
        }
    }return hashSet.size()/2;
}
//    Hány olyan kék szemű felhasználó van, aki több szőke felhasználót húzott jobbra, mint barna hajút balra?
public static int cntBluesMoreBlondeRightThanBrownLeft(){
        int cntBluesMoreBTB=0;
        int cntBlondes= 0;
        int cntBrowns = 0;
        HashSet<String> hashSet = new HashSet<>();
            for (int i = 1; i < userArrayList.size(); i++) {
                if ( userArrayList.get(i).getEye().equals("BLUE") ){
                    System.out.println("blue");
                    for (int j = 1; j <userArrayList.get(i).getGivenLikes().size() ; j++) {

                        for (int k = 0; k <userArrayList.size() ; k++) {
                            if (Integer.parseInt(userArrayList.get(i).getGivenLikes().get(j)[1])==(userArrayList.get(k).getNum())){
//                        System.out.println("1");
                         if (userArrayList.get(k).getHair().equals("BLONDE")){
//                                System.out.println(userArrayList.get(k).getName());
                                cntBlondes++;
                            }}}}
                            for (int j = 1; j <userArrayList.get(i).getGivenDisLikes().size() ; j++) {
                                for (int k = 0; k <userArrayList.size() ; k++) {
                                    if (Integer.parseInt(userArrayList.get(i).getGivenDisLikes().get(j)[1])==(userArrayList.get(k).getNum())&& userArrayList.get(k).getHair().equals("BROWN")){
//                                        System.out.println(userArrayList.get(k).getName());
                                        cntBrowns++;
                                    }
                                }}
                System.out.println(cntBlondes);
                System.out.println(cntBrowns);}
                if (cntBlondes> cntBrowns){
//                    System.out.println(userArrayList.get(i));
                    cntBluesMoreBTB++;}
            cntBlondes=0;
                cntBrowns=0;
            }
    return cntBluesMoreBTB;
}}
////    Hány év a legnagyobb korkülönbségű szimpatikusnak jelölés az adatbázisban?
//public static int maxAgeDiff(){
//    int maxAgeDiff=0;
//    for (int i = 1; i < userArrayList.size(); i++) {
//        for (int j = 1; j <userArrayList.get(i).getGivenLikes().size() ; j++) {
//
//        if ( userArrayList.get(i).getGivenLikes().equals("BLUE") ){
//            System.out.println("blue");
//
//                for (int k = 0; k <userArrayList.size() ; k++) {
//                    if (Integer.parseInt(userArrayList.get(i).getGivenLikes().get(j)[1])==(userArrayList.get(k).getNum())){
////                        System.out.println("1");
//                        if (userArrayList.get(k).getHair().equals("BLONDE")){
////                                System.out.println(userArrayList.get(k).getName());
//                            cntBlondes++;
//                        }}}}
//            for (int j = 1; j <userArrayList.get(i).getGivenDisLikes().size() ; j++) {
//                for (int k = 0; k <userArrayList.size() ; k++) {
//                    if (Integer.parseInt(userArrayList.get(i).getGivenDisLikes().get(j)[1])==(userArrayList.get(k).getNum())&& userArrayList.get(k).getHair().equals("BROWN")){
////                                        System.out.println(userArrayList.get(k).getName());
//                        cntBrowns++;
//                    }
//                }}
//            System.out.println(cntBlondes);
//            System.out.println(cntBrowns);}
//        if (cntBlondes> cntBrowns){
////                    System.out.println(userArrayList.get(i));
//            cntBluesMoreBTB++;}
//        cntBlondes=0;
//        cntBrowns=0;
//    }
//    return cntBluesMoreBTB;
//}}

//    A feladat egy párkereső közösségi oldal nagyon egyszerű modellezése
//    és néhány kérdés megválaszolása az alábbi adatok alapján.
//            (Ha esetleg nem hallottál volna a Tinderről:
//            https://en.wikipedia.org/wiki/Tinder_(app) )
//
//    A közösségi oldalra a felhasználók regisztrálni tudnak,
//    és a regisztrációkor megadott adatokat egy adatbázisban
//    a rendszer eltárolja (users.txt). Egy-egy felhasználóról
//    tároljuk a nevét, nemét (nő, férfi), életkorát, haja színét
//    (szőke, barna, fekete, vörös), szeme színét (kék, zöld, barna, szürke)
//    , valamint egy egyedi azonosítót (egész szám, id). Például:
//            1,Tódor,MALE,23,BROWN,GREEN
//2,Izabella,FEMALE,22,BLONDE,BROWN
//3,Juliska,FEMALE,19,RED,BLUE
//
//    Ezen kívül az adatbázis tárolja (swipes.txt), hogy melyik felhasználó
//    melyik másik személyt jelölte az “érdekel” vagy “nem érdekel” kategóriába
//    (azaz húzta jobbra vagy balra a profilját) már az alkalmazásban,
//    és mikor tette ezt (utóbbit másodperc pontossággal). Például:
//            1,3,LIKE,2018,9,30,23,59,59
//            2,1,LIKE,2018,10,1,0,0,0
//            1,2,DISLIKE,2018,10,2,11,48,40
//    A fenti példa alapján Tódor jobbra húzta Juliska képét az alkalmazásban,
//    illetve Izabella is megjelölte Tódort szimpatikusnak. A két jelölés között
//    pontosan egy másodperc telt el.
//    Másnap ebéd előtt viszont Tódor balra húzta Izabella fotóját az alkalmazásban.
//
//    Modellezd a felhasználókat egy-egy Java objektummal! (Az enumok használata
//    a fix értékkészlettel rendelkező field-ekre erősen javasolt.)
//    Tárold el egy felhasználónál azt is, hogy mely másik felhasználókat jelölte
//    már szimpatikusnak (likes), illetve nem szimpatikusnak (dislikes).
//    Olvasd be a mellékelt adatbázisokat (users.txt és swipes.txt)! Ügyelj arra,
//    hogy egy felhasználót csak egyszer hozz létre!
//    Ki az alkalmazás “királynője”? (Melyik női felhasználót jelölték be a
//    legtöbben kedvencnek?) Ha holtverseny alakul ki, akkor írd ki az összes
//    felhasználó nevét!
//    Melyik felhasználó a legválogatósabb? (Melyik felhasználónál a legkisebb
//    az az arány, hogy hány felhasználót jelölt szimpatikusnak az összes
//    jelöléséhez képest.)
//    Megoldás: Ha a 0 arányú felhasználókat nem veszed figyelembe, akkor Flóra
//    Hány olyan elkeseredett felhasználó volt, aki mindenkit szimpatikusnak jelölt?
//    (Azaz nem volt DISLIKE jelölése, csak LIKE.)
//    Megoldás: 5
//    Hány olyan felhasználó volt, akit senki sem húzott jobbra az alkalmazásban?

//    Megoldás: 4
//    Hány “match” van a felhasználók között a jelenlegi állapot szerint?
//    (Match-nek hívjuk azt az állapotot, amikor két felhasználó egymást kölcsönösen szimpatikusnak jelöli.)
//    Megoldás: 2
//    Hány olyan kék szemű felhasználó van, aki több szőke felhasználót húzott jobbra, mint barna hajút balra?
//    Megoldás: 3
//    Hány év a legnagyobb korkülönbségű szimpatikusnak jelölés az adatbázisban?
//    Megoldás: 38 év
//    Van-e nem heteroszexuális szimpatikusnak jelölés az alkalmazás adatbázisában?
//    Megoldás: true

