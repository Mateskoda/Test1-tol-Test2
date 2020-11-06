package progmatic;
//10,10,10
//100,100,100,100
import java.util.ArrayList;
import java.util.Scanner;

public class KocsmaGame {
    private static int k = 11;
    public static void main(String[] args) {
                System.out.println("Üdvözöllek,  ez itt a Falatozó a Kék Bugyli Bicskához Kocsmárosa Játék\n "
                +"Kérlek add meg,melyik italból mennyi dl-t rendelsz az első körben (pálinka,sör,bor).\n"
                );


    Scanner sc = new Scanner(System.in);
    String quantity = sc.nextLine();
    String[]parts = quantity.split(",");
    int [] partsInt = new int[parts.length];
        for (int i = 0; i < parts.length ; i++) {
            partsInt[i]=Integer.parseInt(parts[i]);
        }
        Kocsma kocsma = new Kocsma(partsInt[0],partsInt[1],partsInt[2],100);  // dl
        KocsmaOrder.setPricestotal(KocsmaOrder.getPricestotal()-partsInt[0]*600-partsInt[1]*20-partsInt[2]*100);
        System.out.println(KocsmaOrder.pricestotal);


        System.out.println(" Kérlek add meg,melyik ital milyen áron kerüljön  eladásra(pálinka,sör,bor,víz)." +
                "                )");
        String prizesFromUser = sc.nextLine();
        parts = prizesFromUser.split(",");
         partsInt = new int[parts.length];
        for (int i = 0; i < parts.length ; i++) {
            partsInt[i]=Integer.parseInt(parts[i]);
        }
        kocsma.setPalinkaPrice(partsInt[0]);
        kocsma.setSorPrice(partsInt[1]);
        kocsma.setBorPrice(partsInt[2]);
        kocsma.setVizPrice(partsInt[3]);
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
            for (int j = 0,x=0; j <vendegek.size() ; ) {
            if(Math.random()<0.8)
            {if (!vendegek.get(j).goingHome){
                vendegek.get(j).makeOrder(kocsma);
                System.out.println( vendegek.get(j).getName()+". vendég");
                j++;
            }
            else{Vendeg vendeg1 = new Vendeg(kocsma);
                vendeg1.setName(k);
                k++;
                vendegek.remove(j);
                vendegek.add(vendeg1);
                j++;

            }
            }
        }
    }
        System.out.println(Vendeg.hostUnServed);
        System.out.println(Vendeg.howManyGoingHome);
        System.out.println(vendegek.size());
        System.out.println(KocsmaOrder.pricestotal);
//        KocsmaOrder.setPricestotal(KocsmaOrder.getPricestotal()+KocsmaOrder.pricestotal);
        System.out.println(Vendeg.punchCnt);
        System.out.println(KocsmaOrder.pricestotal);
        if (KocsmaOrder.pricestotal<=0){
            System.out.println("CSŐDBE JUTOTTÁL");
            int diff =100000+Math.abs(KocsmaOrder.pricestotal);

            System.out.println("A veszteséged "+ diff +" Ft-t.");}
else{

//        2.kör
        for (int l = 2; l <=30 ; l++) {

            System.out.println("Következik a " + l + " . kör. Kérlek add meg, melyik italból mennyit szeretnél venni.(Pálinka,sör,bor)"
            );


            sc = new Scanner(System.in);
            quantity = sc.nextLine();
            parts = quantity.split(",");
            partsInt = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                partsInt[i] = Integer.parseInt(parts[i]);
            }
            KocsmaOrder.setPricestotal(KocsmaOrder.getPricestotal() - partsInt[0] * 600 - partsInt[1] * 20 - partsInt[2] * 100);
//        Kocsma kocsma = new Kocsma(partsInt[0],partsInt[1],partsInt[2],100);  // dl
            kocsma.setPalinka(kocsma.remainingDrinks.get("pálinka") + partsInt[0]);
            kocsma.setSor(kocsma.remainingDrinks.get("sör") + partsInt[1]);
            kocsma.setBor(kocsma.remainingDrinks.get("bor") + partsInt[2]);


            System.out.println(" Kérlek add meg,melyik ital milyen áron kerüljön  eladásra(pálinka,sör,bor,víz)." +
                    "                )");
            prizesFromUser = sc.nextLine();
            parts = prizesFromUser.split(",");
            partsInt = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                partsInt[i] = Integer.parseInt(parts[i]);
            }
            kocsma.setPalinkaPrice(partsInt[0]);
            kocsma.setSorPrice(partsInt[1]);
            kocsma.setSorPrice(partsInt[2]);
            kocsma.setVizPrice(partsInt[3]);
            hour = 7;
            minit = 0;
            //        KocsmaOrder order = new KocsmaOrder(kocsma,drink);
//                System.out.println();
            vendegek = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                System.out.println("vendég " + i);
                Vendeg vendeg = new Vendeg(kocsma);
                vendegek.add(vendeg);
                vendeg.setName(i);
            }
            for (int i = 0; i < 40; i++) {

                System.out.println("idő " + hour + "." + minit);
                if (minit == 0) {
                    minit = 30;
                } else {
                    minit = 0;
                    hour++;
                    if (hour == 25) {
                        hour = 1;
                    }
                }
                for (int j = 0, x = 0; j < vendegek.size(); ) {
                    if (Math.random() < 0.8) {
                        if (!vendegek.get(j).goingHome) {
                            vendegek.get(j).makeOrder(kocsma);
                            System.out.println(vendegek.get(j).getName() + ". vendég");
                            j++;
                        } else {
                            Vendeg vendeg1 = new Vendeg(kocsma);
                            vendegek.remove(j);
                            vendegek.add(vendeg1);
                            vendeg1.setName(k);
                            k++;
                            j++;

                        }
                    }
                }
            }
            System.out.println(Vendeg.hostUnServed);
            System.out.println(Vendeg.howManyGoingHome);
            System.out.println(vendegek.size() - Vendeg.howManyGoingHome);
            System.out.println(KocsmaOrder.pricestotal);
            System.out.println(Vendeg.punchCnt);
            System.out.println(KocsmaOrder.pricestotal);
            if (KocsmaOrder.pricestotal<=0){
                System.out.println("CSŐDBE JUTOTTÁL");
                int diff =100000+Math.abs(KocsmaOrder.pricestotal);

                System.out.println("A veszteséged "+ diff +" Ft-t.");

                break;
            }
        }
        if (KocsmaOrder.pricestotal>100000){
           int diff =KocsmaOrder.pricestotal-100000;
            System.out.println("A vagyonod "+ diff +" Ft-tal nőtt.");
        }

        else{
            int diff =100000-KocsmaOrder.pricestotal;
            System.out.println("A vagyonod "+ diff +" Ft-tal csökkent.");
        }
}}
}
