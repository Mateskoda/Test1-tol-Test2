package progmatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KocsmaMain {
    public static void main(String[] args) {
//        A Falatozó A Kék Bugyli Bicskához nevű kocsmában sört, bort, pálinkát és vizet lehet rendelni.
//        Mindegyik italból meghatározott, véges mennyiség van, kivéve a vizet, abból akármennyi van.
//        Mindegyik italnak van ára. Írj programot, amivel rendelhetünk a kocsmából italt. Ha van a kért
//        italból, akkor a program írja ki, hogy mit sikerült vásárolnunk és azt is, hogy mennyivel
//        növeltük a kocsma vagyonát. Ha nincs már a kért italból, a program íjra ki, hogy melyik italból
//        mennyi van és ajánlja fel, hogy másikat válassszunk!
        System.out.println("Üdvözöllek,  ez itt a Falatozó a Kék Bugyli Bicskához rendelő felülete.\n "
                +"Kérlek válassz az Itallapról(sör, bor, pálinka,víz).\n"+ "Add meg, mennyit kérsz,milyen italból " +
                        "és hányszor!(1 sör -5dl,1 bor 2 dl,1 pálinka 0.5 dl, 1 víz adag 1 dl>\n"+
 "Ha több fajta italt kérsz,azt vesszővel válaszd el."
        );
       Kocsma kocsma = new Kocsma(100,100,100,100);  // dl

        Scanner sc = new Scanner(System.in);
        String drink = sc.nextLine();
        int hour= 7;
        int minit = 0;
//        KocsmaOrder order = new KocsmaOrder(kocsma,drink);
//                System.out.println();
        ArrayList<Vendeg> vendegek= new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            System.out.println("vendég " +i);
            Vendeg vendeg = new Vendeg(kocsma);
            vendegek.add(vendeg);
            vendeg.setName(i);
        }
        for (int i = 0; i <40 ; i++) {

            System.out.println("idő "+hour+"."+minit);
            if (minit ==0){
                minit=30;
            }
            else{
                minit=0;
                hour++;
                if(hour ==25){
                    hour=1;
                }
            }
            for (Vendeg vendeg : vendegek) {
                if(Math.random()<0.4)
                {vendeg.makeOrder(kocsma);
                    System.out.println( vendeg.getName()+". vendég");
                }
            }
        }
        System.out.println(Vendeg.hostUnServed);
        System.out.println(Vendeg.howManyGoingHome);
        System.out.println(vendegek.size()-Vendeg.howManyGoingHome);
        System.out.println(KocsmaOrder.pricestotal);
        System.out.println(Vendeg.punchCnt);

    }

//    Bővítsd a programot azzal, hogy minden egyes italtípushoz tartozzon
//    egy alkoholszázalék is és az is, hogy az adott italtípusból egy adag
//    hány dl-t jelent (pl a sör alkoholszázaléka 0.045 és egy adag 5dl). Miután
//    sikeresen rendeltünk egy italt, a program azt is írja ki, hogy mennyi
//    alkohol kerül ezzel a szervezetünkbe.
//    Bővidsd a programodat úgy, hogy a kocsmát ne egy a terminálon pötyögő
//    felhasználó, hanem programmal szimulált vendégek látogassák. Szimulálj
//    10 vendéget. A vendégek nem teljesen egységesen viselkednek, az egyes
//    vendégeknek van karaktere. Van aki a sört szereti, van aki a bort, van
//    aki a pálnikát, és akad olyan is, aki a vizet. Van, aki csak olyat iszik,
//    amit legjobban szeret, van, aki jobb híján másra is ráfanyalodik.
//    Van aki hamarabb távozik, van aki később. Az egyes vendégek karakterét
//    a program a vendég objektum konstruktorában véletlen számok alapján
//    határozza meg! Szimuláld a kocsma egy napját. A Kék Bugyli reggel héttől
//    hajnal háromig van nyitva és fél óránként lehet valamit rendelni. Fél
//    óránként minden vendég eldönti, hogy szomjas-e. Ha szomjas, akkor eldönti,
//    hogy mit szeretne inni. Ha van a kívánt italból, akkor vásárol, ha nem,
//    akkor szomorúan vagy türelmetlenül tovább beszélget a barátaival. A
//    szimuláció végén írjuk ki, hogy mennyivel gyarapodott a kocsma vagyona,
//    hogy hány vendég van még a kocsmában és hogy hányszor fordult elő,
//    hogy egy vendég nem tudott rendelni (mert az ital, amit rendelni akart
//            elfogyott)!
//    Bővítsd a vendégek karakterét azzal, hogy egyes vendégek, ha nagyon
//    türelmetlenek lesznek, akkor verekedni kezdenek. A verekedő vendégek
//    a kocsma vagyonát amortizálják (a kocsmárosnak ugyanis ki kell fizetnie
//            a javítási költségeket). Az hogy egy vendég mennyire türelmetlen
//    azon múlik, hogy hány sikertelen rendelése volt, és hogy mennyire részeg
//            (minél részegebb annál kevesebb sikertelen rendelés után lesz
//                    türelmetlen). Az egyes vendégek ebben is eltérnek, van
//    aki sosem lesz türelmetlen, van aki igen hamar, és van aki csak akkor,
//    ha nagyon részeg és nem szolgálják ki. Az egyes vendégek karakterét a
//    program most is a vendég objektum konstruktorában véletlen számok alapján
//    határozza meg! A szimuláció közben a program írja ki, ha egy vendég
//    verekedni kezd. A végén írjuk ki hogy nőtt vagy csökkent-e a kocsma
//    vagyona.
//    Alakítsd a programodat egy játékprogrammá, amiben kocsmárost játszhatunk.
//    A játék körökre van osztva. Egy körben a kocsmáros eldönti, hogy melyik
//    italból mennyit rendel, és hogy mennyi lesz az egyes italok aktuális ára.
//    Ezután eltelik egy kocsmai nap, aminek során minden fél órában vendégek
//    érkeznek a kocsmába, néhányszor rendelnek, ha van a rendelt italból, akkor
//    fizetnek, esetleg verekszenek, idővel távoznak (és ilyenkor a helyükre újak
//            jönnek). Az egyes italok árát a kocsmáros határozza meg, és ő
//    tud új adagokat is rendelni. A kocsmáros 100 Ft-ért tud venni egy adag
//    sört, 200 Ft-ért egy adag bort és 300 Ft-ért egy adag pálinkát. A
//    kocsmáros kezdőtőkéje 100.000 Ft, ez a vásrlások-eladások során
//    természetesen változik. A tőke negatívba nem mehet. Ne feledd, hogy a
//    verekedő vendégek is ezt a likvid vagyont amortizálják! A játéknak akkor
//    van vége, ha eltelt egy hónap, vagy ha a kocsma idő előtt tönkre megy
//            (a tőke nulla alá megy). Ha a kocsma nem ment tönkre egy hónap
//        alatt, akkor a játék végén írjuk ki, hogy mennyit gyarapodott
//            (vagy csökkent) a kocsma vagyona.

}
