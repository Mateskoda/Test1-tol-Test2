package progmatic;

import java.util.ArrayDeque;
import java.util.Deque;

public class PetrolMain {

    public static void main(String[] args) {
        int[] capacities = {4, 6, 7, 4};
        int[] distances = {6, 5, 3, 5};
        System.out.println(simulation0ToEnd(capacities, distances));
    }

    public static int simulation0ToEnd(int[] cap, int[] dist) {
        int cnt = 0;
        int n = cap.length;
        int[] capMinusDist = new int[n];
        for (int i = 0; i < n; i++) {

            capMinusDist[n-1-i] = cap[i] - dist[i];
        }
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int sum = 0;

        int i = 0;
        int i2 = 0;
        int ind = 0;
        for (int j = 0; j<n;j++ ) {
            deque.addLast(capMinusDist[i]);
        }
            while (sum >= 0 ) {
                sum += capMinusDist[i];
                i++;
            }
//            while (sum < 0 && j<=n) {
//                deque.addFirst(capMinusDist[capMinusDist.length - 1 - i2]);
//                sum += capMinusDist[capMinusDist.length - 1 - i2];
//                i2++;
//                j++;
//            }
//        }
        if (sum >= 0) {
            return deque.peekFirst();
        } else {
            return -1;
        }

    }
//    Benzinkutak
//    Adott egy kör alakú útvonal, amely mentén n db benzinkút található.
//    Két bemeneti tömbünk van: az egyes benzinkutak kapacitása (mennyi üzemanyag
//    kapható ott), illetve az adott kúttól a következő kútig mért távolság.
//    Melyik az az első benzinkút, amelytől indulva egy autó végig tud menni
//    az útvonalon úgy, hogy ne fogyjon ki menet közben az üzemanyaga? Tegyük
//    fel, hogy az autónak végtelen kapacitású benzintartálya van, és az első
//    benzinkút előtt nem tankol; valamint hogy az autónk egy távolságegység alatt
//    1 egység üzemanyagot használ fel.
//    Elvárt időkomplexitás: O(n).
//    Pld: int[] capacities = { 4, 6, 7, 4 } és int[] distances = { 6, 5, 3, 5 }
//    esetén a várt kimenet 1. Ha az autó a 0. helyről indulna, akkor csak 4 egység
//    benzint tudna tankolni, de a következő kút 6 távolságegységre van.
//    Tipp1: mégnézhetnénk minden lehetséges kiindulópontot, hogy onnan lehet-e
//    túrát indítani (gyakorlatilag végigszimuláljuk az utat). Ennek a megoldásnak
//    az időkomplexitása viszont O(n^2). Ettől függetlenül a gyakorlás kedvéért
//    megpróbálhatod így is megoldani a feladatot.
//            Tipp2: Egy Queue-t (LinkedList) használva elindíthatsz egy szimulációt.
//            Amíg tudjuk folytatni az aktuális utat, hozzáadunk a Queue-hoz újabb
//            megállókat. Ha a benzinünk elfogyna, akkor a Queue elejéről leveszünk
//            egy / néhány megállót.
}
