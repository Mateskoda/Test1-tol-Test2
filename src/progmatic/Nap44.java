package progmatic;

import java.util.Scanner;

public class Nap44 {

    public static void main(String[] args) {
        System.out.println("Add meg ,mekkora összeget szeretnél felvenni !");
        Scanner sc =  new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println("Add meg,hogy hány hónapos futamidőt szeretnél");
        int month = sc.nextInt();
        System.out.println("Ha VIP ügyfél vagy,akkor add meg a 4 jegyű kódodat! (ha nem,akkor írj egy 1-t) ");
        int vipCode = sc.nextInt();
        LoanResponse loan1 = new LoanResponse(money,month,vipCode);
        LoanResponse2 loan2 = new LoanResponse2(money,month,vipCode);
     loan1.response();
       // System.out.println(loan2);
        //System.out.println(loan1);
        //System.out.println(loan2);

        loan1.response();

    }

  //  Normál ügyfeleknek a bank maximum 20 M Ft kölcsönt ad. 500 000 ft-ig automatikusan folyósítják a kölcsönt. 500e és 3 M Ft között a kölcsönhöz fedezet szükséges. A fedezet értéke el kell érje a hitel 80 százalékát. 3 M Ft feletti hitelekhez fedezet és kezes is szükséges.
    /*Vip ügyfeleknek a bank maximum 50 M Ft kölcsönt ad. 3M ft-ig automatikusan folyósítják a kölcsönt. 3M és 20 M Ft között a kölcsönhöz fedezet szükséges. A fedezet értéke el kell érje a hitel 70 százalékát. 20 M Ft feletti hitelekhez fedezet és kezes is szükséges.
    A futamidőt az ügyfél választhatja meg 12 és 60 hónap között.
    Normál ügyfeleknek 12 hónapos futamidőre 50 százalékos a kamat, hosszabb futamidőknél havonta 3 százalékkal nő.
    Vip ügyfeleknek 12 hónapos futamidőre 40 százalékos a kamat, hosszabb futamidőknél havonta 2 százalékkal nő.
    Írj programot, amivel egy potenciális hitelfelvevő kiszámíthatja,
     hitelének részleteit! A felhasználó megadja, hogy mekkora összeget szeretne felvenni,
     mekkora futamidőre, és hogy VIP ügyfél-e (ezt egy VIP kóddal tudja igazolni).
      A program megmondja, hogy az adott összeg felvehető-e, s ha igen, akkor azt is, hogy kell-e és milyen értékű fedezet,
      kell-e kezes, és mekkora lesz a havi törlesztő részlet. Old meg a feladatot objektum orientált módon!
*/

}
