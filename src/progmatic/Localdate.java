//package progmatic;
//
//public class LocalDate {
//    String date;
//    int month;
//    int day;
//
//
//    public LocalDate(String date) {
//        this.date= date;
//        String [] monthAndDay = date.split(".");
//        month = Integer.parseInt(monthAndDay[0]);
//        day = Integer.parseInt(monthAndDay[1]);
//    }
//    public int getMonth() {
//        return month;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//}
// Fejlesszük tovább foglalási rendszerünket úgy, hogy csak olyan foglalást engedélyezünk, ami legalább 2 éjszakára vonatkozik.
//
//        Tipp: Dátumok reprezentálására használd a Java LocalDate osztályát!
//        Egy adott napot reprezentáló LocalDate-et így hozhatsz létre:
//        LocalDate date = LocalDate.parse("2017-02-03");
//        A LocalDate a java.time packageben található.
//        A LocalDate-nek számos hasznos metódusa van, pl isBefore(), isAfter, minus(), plus(), getDay(), getMonth(), stb… Tájékozódj ezekről a NetBeans-ben és a Google-ön!
//        Két LocalDate közti különbség napokban így számolható ki:
//        Long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate)
//        A ChronoUnit osztály a java.time.temporal package-be található.

