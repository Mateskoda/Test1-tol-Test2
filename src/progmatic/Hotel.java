package progmatic;

import java.time.LocalDate;
import java.util.Scanner;

public class Hotel {
    ReservationRequest request1;
    public static void main(String[] args) {
        System.out.println("Kérem adja meg, mikor érkezik a szállásra !(pl.2017-02-03)");
        Scanner sc = new Scanner(System.in);
        LocalDate start = LocalDate.parse(sc.nextLine());
//        LocalDate start = new LocalDate(sc.nextLine());
        System.out.println("Kérem adja meg ,melyik nap hagyja el a szállást !(pl.2017-02-03)");
        LocalDate end = LocalDate.parse(sc.nextLine());
//        LocalDate end =new LocalDate(sc.nextLine());
        System.out.println("Kérem adja meg a létszámot !");
        int numOfHost= sc.nextInt();
        System.out.println("Kérlek add meg, milyen ellátást kérsz:csak reggeli/teljes");
        sc= new Scanner(System.in);
        String meals = sc.nextLine();
        ReservationRequest request1= new ReservationRequest(start,end,numOfHost,meals);

    }

//   public
//        ReservationResponse doReservation(ReservationRequest re){
//        ReservationResponse response1= new ReservationResponse();
//        response1.setPrice(request1.startDate,request1.endDate,request1.getNrOfPersons(),request1.meals);
//    return response1;
//   }
//    Feltehetjük, hogy egy foglalásban az összes vendég
//    azonos ellátást kér. Ha négynél többen foglalnak,
//    akkor egynél több szobára lesz szükség.
//    Írjuk meg a programunkat objektumorientált módon!
//    Használjuk az alábbi osztályokat!

}
