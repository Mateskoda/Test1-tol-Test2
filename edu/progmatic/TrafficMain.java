package edu.progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TrafficMain {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc2 = new Scanner(new File("Textedu/forgalom.txt"));
        sc2.nextLine();
        int[][] traffic = new int[arrayCnt() - 1][4];
        String[] trafficString = new String[arrayCnt() - 1];
        for (int i = 0; sc2.hasNextLine(); i++) {
            String line = sc2.nextLine();
            String[] parts = line.split(" ");
            traffic[i][0] = Integer.parseInt(parts[0]);
            traffic[i][1] = Integer.parseInt(parts[1]);
            traffic[i][2] = Integer.parseInt(parts[2]);
            traffic[i][3] = Integer.parseInt(parts[3]);
            trafficString[i] = parts[4];

        }
        System.out.println(Arrays.deepToString(traffic));
        System.out.println(Arrays.toString(trafficString));
    arrayOfPassingCars(traffic,trafficString);
    }

    public static int arrayCnt() throws FileNotFoundException {
        int cnt = 0;
        Scanner sc = new Scanner(new File("Textedu/forgalom.txt"));

        for (int i = 0; sc.hasNextLine(); i++) {
            sc.nextLine();
            cnt++;
        }
        return cnt;
    }

    public static void direction(String[] trafficString) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Add meg ,hányadik autó menetirányára vagy kíváncsi!");
        int num = sc2.nextInt();
        System.out.println("Írja ki a képernyőre, hogy az n-edikként belépő jármű melyik város felé haladt!");
        if (trafficString[num - 1] == "F") {
            System.out.println("A");
        } else {
            System.out.println("F");
        }

    }

    public static int difference(int[] trafficString, int[][] traffic) {
        System.out.println(" 3. Írja a képernyőre, hogy a Felső város irányába tartó utolsó két" +
                " jármű hány másodperc különbséggel érte el az útszakasz kezdetét!");
        int cntlast2 = 0;
        int cntI = 0;
        int cntI2 = 0;
        for (int i = trafficString.length - 1; i >= 0; i--) {
            if (cntlast2 == 2) {
                break;
            }
            if (trafficString[i] == 'F') {
                if (cntlast2 == 0) {
                    cntI = i;
                } else {
                    cntI2 = i;
                }
                cntlast2++;
            }
        }
        int seconds = (traffic[cntI][0] * 3600 + traffic[cntI][1] * 60 + traffic[cntI][2] - traffic[cntI2][0] * 3600 - traffic[cntI2][1] * 60 - traffic[cntI2][2]);
        return seconds;
    }

    public static void arrayOfPassingCars(int[][] traffic, String[] trafficStrings) {
        System.out.println("4. Határozza meg óránként és irányonként, hogy hány jármű érte el a szakaszt! ");
        int cnt = 1;
        for (int i = 1; i < traffic.length; i++) {
            if (traffic[i][0] != traffic[i - 1][0]) {
                cnt++;
            }
        }
        int[][] arrayOfPC = new int[cnt][3];
        int cntF = 0;
        int cntA = 0;
        for (int i = 0, j = 0; i < traffic.length-1; i++) {
            if (traffic[i][0] != traffic[i + 1][0]) {
                arrayOfPC[j][0] = traffic[i][0];
                if (trafficStrings[i].equals( "F") {
                    cntF++;
                } else {
                    cntA++;
                }
                arrayOfPC[j][1] = cntF;
                cntF = 0;
                arrayOfPC[j][2] = cntA;
                cntA = 0;
                j++;
            }
            if (traffic[i][0] == traffic[i + 1][0]) {
                cnt++;
                arrayOfPC[j][0] = traffic[i][0];
                if (trafficStrings[i] == "F") {
                    cntF++;
                } else {
                    cntA++;
                }

            }
        }
        System.out.println(Arrays.deepToString(arrayOfPC));

    }

//    egy-egy óra adatait írja a képernyőre! Az első érték az órát, a második érték az Alsó, a
//    harmadik a Felső város felől érkező járművek számát jelentse! A kiírásban csak azokat az
//    órákat jelenítse meg, amelyekben volt forgalom valamely irányban!
//    Az Alsó és Felső várost összekötő út 1 000 m hosszú részének a felújításán dolgoznak. En-
//    nek a szakasznak a forgalmát figyeljük egy nap néhány óráján keresztül. Az említett szaka-
//    szon előzési tilalom van érvényben.
//
//    A forgalmat a forgalom.txt állomány tartalmazza. Első sorában a megfigyelési idő-
//    szakban áthaladó járművek száma (legfeljebb 2000) látható, a továbbiakban pedig soronként
//
//    egy áthaladó jármű adatai olvashatók időrendben. Egy sorban az első három szám azt az idő-
//    pontot jelöli (óra, perc, másodperc), amikor a jármű belép a vizsgált útszakaszra. A következő
//
//    szám jelöli, hogy a jármű az érintett távolságot hány másodperc alatt tenné meg (legfeljebb
//300) – a belépéskor mért sebességgel –, ha haladását semmi nem akadályozná. Ezt egy betű
//    követi, amely jelzi, hogy a jármű melyik város irányából érkezett. Ennek megfelelően a betű
//    A vagy F lehet. Az egyes adatokat pontosan egy szóköz választja el egymástól.
//
//    Ha az útszakaszon egyik jármű utoléri a másikat, akkor az előzési tilalom miatt úgy tekint-
//    jük, hogy változatlan sorrendben, ugyanabban az időpillanatban hagyják el a szakasz, mint
//
//    ahogy a lassabb jármű tenné.
//            Például:
//    forgalom.txt
//1105
//        7 21 1 60 F
//7 21 58 69 F
//7 22 4 117 F
//7 22 39 155 A
//7 23 11 99 A
//...
//    A 3. sor megmutatja, hogy a 7 óra 21 perc 58 másodperckor a Felső város felől érkező
//
//    jármű 69 másodperc alatt tenné meg ezt az 1 km hosszú távolságot. Ez a jármű – ha más jár-
//    művek nem akadályozzák – 7 óra 23 perc 7 másodperckor lép ki az útszakaszról, tehát akkor
//
//    már nem tartózkodik ott.
//
//    Készítsen programot, amely az alábbi kérdésekre válaszol! A program forráskódját ut né-
//    ven mentse! Ügyeljen arra, hogy programjának más bemeneti állomány esetén is működnie
//
//    kell!
//    Minden részfeladat megoldása előtt írja a képernyőre annak sorszámát! Ha a felhasználótól
//    kér be adatot, jelenítse meg a képernyőn, hogy milyen értéket vár (például a 2. feladat esetén:
//            „2. feladat Adja meg a jármű sorszámát!”)!
//            1. Olvassa be a forgalom.txt állományban talált adatokat, s azok felhasználásával oldja
//
//    meg a következő feladatokat! Ha az állományt nem tudja beolvasni, akkor az első 10 so-
//    rának adatait jegyezze be a programba és dolgozzon azzal!
//
//            2. Írja ki a képernyőre, hogy az n-edikként belépő jármű melyik város felé haladt! Ehhez
//    kérje be a felhasználótól az n értékét!
//
//
//            4. Határozza meg óránként és irányonként, hogy hány jármű érte el a szakaszt! Soronként
//    egy-egy óra adatait írja a képernyőre! Az első érték az órát, a második érték az Alsó, a
//    harmadik a Felső város felől érkező járművek számát jelentse! A kiírásban csak azokat az
//    órákat jelenítse meg, amelyekben volt forgalom valamely irányban!
//
//            5. A belépéskor mért értékek alapján határozza meg a 10 leggyorsabb járművet! Írassa ki a
//    képernyőre ezek belépési idejét, a várost (Alsó, illetve Felső), amely felől érkezett, és
//
//    m/s egységben kifejezett sebességét egy tizedes pontossággal, sebességük szerinti csökke-
//    nő sorrendben! Ha több azonos sebességű járművet talál, bármelyiket megjelenítheti. So-
//    ronként egy jármű adatait jelenítse meg, és az egyes adatokat szóközzel tagolja! (A feladat
//
//    megoldásakor figyeljen arra, hogy a következő feladatban az adatok eredeti sorrendjét
//    még fel kell használni!)
//
//            6. Írassa ki az also.txt állományba azokat az időpontokat, amikor az Alsó város felé tar-
//    tók elhagyták a kérdéses útszakaszt! Ha egy jármű utolér egy másikat, akkor a kilépésük
//
//    időpontja a lassabb kilépési ideje legyen! A fájl minden sorába egy-egy időpont kerüljön
//    óra perc másodperc formában! A számokat pontosan egy szóköz válassza el egymástól!
}
