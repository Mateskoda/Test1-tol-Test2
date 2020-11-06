package progmatic;

import java.io.FileNotFoundException;

public class TvMain {
    public static void main(String[] args) throws FileNotFoundException {
    Tvprogram musor1 = new Tvprogram();
        System.out.println(musor1.channels);
//        1. Hány csatorna van összesen?
        System.out.println(" 1. Hány csatorna van összesen? \n"+musor1.channels.size());
//        2. Hány különböző műsor van?
        System.out.println(" 2. Hány különböző műsor van? \n"+ musor1.cntProgrammes());
//        3. Kérjen be a felhasználótól egy csatornát.
//        Hány különböző műsort játszanak ezen a csatornán?
        System.out.println( "Hány különböző műsort játszanak ezen a csatornán?\n"+musor1.oneChannelCnt("M1"));
// 4. Kérjen be a felhasználótól egy műsort. Hány csatornán adják a megadott
// műsort?
        System.out.println("Hány csatornán adják a megadott műsort?\n"+musor1.oneProgrammeCnt("Sharknado"));
//        5. A megadott csatornán adják-e a megadott műsort?
        System.out.println(" A megadott csatornán adják-e a megadott műsort?\n"+musor1.isOnThisChannel("RTL","Sharknado"));
//        6. Melyik műsort játsszák a legtöbb csatornán?


    }
//    TV Műsorok
//    Olvasd be a
//    szöveges file-ból az adatokat, amiben minden sorban a
//    csatorna neve és space-szel elválasztva a sugárzott műsor található.
//    A csatorna nevekben nincs space, a műsorokban lehet!
//    A fájl beolvasásánál, a tv műsorok beolvasásához használd
//    a String osztály trim() beépített metódusát!
//    https://www.w3schools.com/java/ref_string_trim.asp
//    https://www.tutorialspoint.com/java/java_string_trim.htm
//    https://www.geeksforgeeks.org/java-string-trim-method-example/
//    https://www.javatpoint.com/java-string-trim
//
//    Találj megfelelő adatszerkezeteket, hogy a kódod meg tudja
//    válaszolni a következőket:
//
//
//
//
//            7. Csatornánként hány különféle műsort adnak?
//            8. Van -e olyan műsor, amelyet minden csatornán adnak?
//            9. Van-e olyan műsor, amit csak egyetlen csatornán adnak?
//
}
