package progmatic;

public class ElectricBike extends CityBike {
    int akku = 100;
    int engine = 10;

    public ElectricBike() {
        super();
    }

    public int getAkku() {
        return akku;
    }

    public void charge() {
        akku = 100;
    }

    @Override
    public double getSpeed(double fordulatPerSec) {
        if (akku > 0) {
            return super.getSpeed(fordulatPerSec) + 10;
        }
        return super.getSpeed(fordulatPerSec);
    }
    //    Készíts egy elektromos bicikli osztályt is. Egy elektromos bicikli olyan mint egy normál bicikli, csak van egy motorja és egy akkumulátora.
//    Az akkut lehet tölteni, ill. meg lehet állapítani az aktuális töltöttségi állapotát. Ha az akkumulátor nincs lemerülve, akkor tekerésnél a motor rásegít.
//    Tegyük fel, hogy a motor mindig egy konstans értékkel gyorsítja a biciklit, a konstans nagysága a motor teljesítményétől függ. Elektromos bicikli osztályod
//    rendelkezzen ugyanazokkal a metódusokkal, amikkel a bicikli osztály (public double getSpeed(double cadence), public double getCadencePerSec(double speed) -
//    vagy ahogy nevezeted őket). Használj itt is öröklődést!
//    Hogyan módosul a kódod, ha feltesszük, hogy minden elektromos bicikli egyben városi bicaj is (vagyis van világítása és csengője)?

}
