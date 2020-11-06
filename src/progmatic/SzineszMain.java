package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SzineszMain {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Artist> artists2 = new ArrayList<>();
        Scanner sc = new Scanner(new File("foglalkozas.txt"));
        for (int i = 0; sc.hasNext(); i++) {
            Artist a = new Artist();
            String line = sc.nextLine();
            String[] parts = line.split(",");
            a.setName(parts[0]);
            for (int j = 1; j < parts.length; j++) {
                a.work.add(parts[j]);
            }
            artists2.add(a);
//            System.out.println(artists.get(0).work);
        }
        ArrayList<Artist> artists = new ArrayList<>();

        Scanner sc2 = new Scanner(new File("szemely.txt"));
        for (int i = 0; sc2.hasNext(); i++) {
            Artist a = new Artist();
            String line = sc2.nextLine();
            String[] parts = line.split(",");
            a.setName(parts[0]);
            a.setDateOfPrize(Integer.parseInt(parts[1]));
            if (parts.length > 2) {
                if ((!parts[2].equals("null"))) {
                    a.setTypeOfPrize(parts[2]);
                }
            } else {
                a.setTypeOfPrize("nincs díja");
            }
            artists.add(a);

        }
        Collections.sort(artists, new ArtistSortByName());
        Collections.sort(artists2, new ArtistSortByName());
        for (int i = 0; i < artists.size(); i++) {
//            System.out.println(artists2.get(i).getWork());
//            System.out.println(artists2.get(i).work);
            artists.get(i).work = artists2.get(i).work;
//            artists2.remove(i);
        }
//        for (int i = 0; i < 80; i++) {
//            System.out.println(artists.get(i).getName());
//            System.out.println(artists.get(i).getWork());
//        }
//        for (int i = 0; i<rewardedIn2013(artists).size(); i++) {
//            System.out.println(rewardedIn2013(artists).get(i).getName());
//        }
        for (int i = 0; i<balett(artists).size(); i++) {
            System.out.println(balett(artists).get(i).getName() + balett(artists).get(i).work);
        }
        System.out.println(mostPrize(artists));
        eachWorks(artists);
        pittiKatalin(artists);
        System.out.println(graficAndOtherworkingAereas(artists));
    }

//    A Magyar Köztársaság Érdemes Művésze díj állami kitüntetés, amelyet évente adnak át. A díjat mindenki egyszer kaphatja meg, akkor is, ha több művészeti ágban is tevékenykedik. A 2000-2013. között díjazottak adatai állnak rendelkezésre a szemely.txt, a foglalkozas.txt állományban.
//
//    Az állományok vesszővel tagolt, UTF-8 kódolású szövegfájlok.
//
//    szemely:
//            - A kitüntetett neve (szöveg)
//               - Melyik évben kapta meg a kitüntetést (szám)
//               - A díjazott eddigi legmagasabb kitüntetésének neve, amennyiben volt neki (szöveg)
//    foglalkozasok:
//            - A személy neve
//               - A művészeti foglalkozás(ok) neve(i), vesszővel elválasztva (szöveg)
//
//    A beolvasáshoz hozz létre egy megfelelő Artist osztályt, amely egy-egy személy adatait tárolja!
//
//    PROTIP: A feladatok megoldása közben gondolj arra, hogy egy-egy feladatot lehet, hogy könnyebb
//    megoldani, ha létrehozol egy segédstruktúrát! (Map, Set, List)
//
//            1. Olvasd be az adatokat egy megfelelő adatstruktúrába!
//
//            2. Sorold fel ábécérendben a 2013-ban kitüntetettek nevét! Írd meg a
//            feladatot comparator segítségével is!
//
    public static ArrayList<Artist>rewardedIn2013(ArrayList<Artist> artists){
        ArrayList<Artist> rewarded = new ArrayList<>();
        for (int i = 0; i < artists.size(); i++) {
            if (artists.get(i).getDateOfPrize()==2013){
                rewarded.add(artists.get(i));
            }
        }
        Collections.sort(rewarded, new ArtistSortByName());
        return rewarded;

    }
//            3. Balettel foglalkozó díjazottakra vagyunk kíváncsiak,
//            de többféle ezzel kapcsolatos hivatás létezik.
//            Írasd ki azoknak a nevét és foglalkozását, akik foglalkozási
//            neve tartalmazza a „balett” szórészletet!
public static ArrayList<Artist>balett(ArrayList<Artist> artists){
    ArrayList<Artist> balett = new ArrayList<>();
    for (int i = 0; i < artists.size(); i++) {
        for (int j = 0; j <artists.get(i).work.size() ; j++) {
        if (artists.get(i).work.get(j).contains("balett")){
            if (!(balett.contains(artists.get(i)))){
            balett.add(artists.get(i));
            }
        }}
    }
//    Collections.sort(rewarded, new ArtistSortByName());
    return balett;

}
//            4. Melyik évben volt a legtöbb díjazott és hányan voltak?
public static Integer mostPrize(ArrayList<Artist> artists){
    ArrayList<Artist> mostPrize = new ArrayList<>();
    Collections.sort(artists, new ArtistSortByName());
    HashMap<Integer,ArrayList> prizesInYears = new HashMap<>();
    for (int i = 0; i < artists.size(); i++) {
        prizesInYears.putIfAbsent(artists.get(i).dateOfPrize, new ArrayList());
        prizesInYears.get(artists.get(i).dateOfPrize).add(artists.get(i).getName());
    }
    System.out.println(prizesInYears);
    int max = Integer.MIN_VALUE;
    int maxKey= 0;
    for (Integer integer : prizesInYears.keySet()) {
            if (prizesInYears.get(integer).size()>max){
                max = prizesInYears.get(integer).size();
                maxKey= integer;
            }}return maxKey;
    }
//            5. Add meg, hogy az egyes foglalkozásnevekhez hány művész tartozik!
//            A képernyőn darabszám
//            szerint csökkenően jelenítsd meg a foglalkozásneveket és a darabszámokat!
public static void eachWorks(ArrayList<Artist> artists) {
    HashMap<String, ArrayList> hashEachWorks = new HashMap<String, ArrayList>();
    for (int i = 0; i < artists.size(); i++) {
        for (int j = 0; j < artists.get(i).getWork().size(); j++) {
            hashEachWorks.putIfAbsent(artists.get(i).getWork().get(j), new ArrayList());
            hashEachWorks.get(artists.get(i).getWork().get(j)).add(artists.get(i).getName());
        }
    }
    TreeMap<Integer, ArrayList> hashEachWorks2 = new TreeMap<>();
//    for (int i = 0; i < artists.size(); i++) {
    for (String s : hashEachWorks.keySet()) {
        hashEachWorks2.putIfAbsent(hashEachWorks.get(s).size(), new ArrayList());
        hashEachWorks2.get(hashEachWorks.get(s).size()).add(s);
    }
//        ArrayList<Integer> rendezes = new ArrayList<>();
    System.out.println(hashEachWorks2);
//    for (String s : hashEachWorks.keySet()) {
//
//    }


//Collections.sort();
//    int max = Integer.MIN_VALUE;
//    int maxKey= 0;
//    for (Integer integer : prizesInYears.keySet()) {
//        if (prizesInYears.get(integer).size()>max){
//            max = prizesInYears.get(integer).size();
//            maxKey= integer;
//        }}return maxKey;

//
//            6. Sorold fel Pitti Katalinnal együtt azoknak a nevét és a
//            kitüntetés évét, akik vele azonos foglalkozásúak!
//}
}
    public static void pittiKatalin(ArrayList<Artist> artist){
        ArrayList<String> herWork= new ArrayList<>();
//        System.out.println(artist.get(0).getWork().get(0));
        for (int i = 0; i <artist.size() ; i++) {
            if ( artist.get(i).getName().equals("Pitti Katalin")){
                        herWork = artist.get(i).getWork();
        }       }
        String herWorkString = null;
        System.out.println(herWork);
//        for (int i = 0; i <herWork.size() ; i++) {
//            herWorkString=herWork.get(i).concat(herWorkString);
//        }
        System.out.println(herWorkString);
        for (int i = 0; i <artist.size() ; i++) {
            for (int j = 0; j <artist.get(i).getWork().size() ; j++) {
//                System.out.println(artist.get(i).getWork().get(j));
            if (artist.get(i).getWork().contains("operaénekes")){
                System.out.println(artist.get(i).getName()+ artist.get(i).dateOfPrize);
        }
    }}

//            7. Határozd meg, hogy a grafikusoknak milyen más foglalkozásaik
//            vannak még! A listában a „grafikus” foglalkozásnév már ne szerepeljen,
//            és minden foglalkozás neve egyszer jelenjen meg!


    }
public static ArrayList<String > graficAndOtherworkingAereas(ArrayList<Artist> artists){

HashMap <String,ArrayList<String>> hashEachWorks = new HashMap<String, ArrayList<String>>();
    for (int i = 0; i < artists.size(); i++) {

            hashEachWorks.putIfAbsent("grafikus", new ArrayList());
            if (artists.get(i).getWork().contains("grafikus")){
                for (int j = 0; j < artists.get(i).getWork().size(); j++) {
                    if (!(artists.get(i).getWork().get(j).equals("grafikus"))){
                        hashEachWorks.get("grafikus").add(artists.get(i).getWork().get(j));
                    }
                }
            }
        }
    return hashEachWorks.get("grafikus");
    }
}