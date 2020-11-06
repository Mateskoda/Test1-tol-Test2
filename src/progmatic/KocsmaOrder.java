package progmatic;

import java.util.ArrayList;
import java.util.HashMap;

public class KocsmaOrder {
    static int pricestotal = 100000;
    static ArrayList<Integer> pricesArray = new ArrayList<>();
    String[] oneOrder;
    HashMap<String, int[]> drinks;
    double price = 0;
    double alcPercentage = 0;
    boolean drinkIsOrNot;
    public KocsmaOrder(Kocsma kocsma, String order) {
        oneOrder = order.split(",");
        for (int i = 0; i < oneOrder.length; i++) {
            String[] parts = oneOrder[i].split(" ");
            KocsmaOneDrinkOrder oneDrinkOrder = new KocsmaOneDrinkOrder(kocsma, parts);
            this.drinkIsOrNot = oneDrinkOrder.drinkIsOrNot(kocsma);
            if (!oneDrinkOrder.drinkIsOrNot(kocsma)) {
                System.out.println("a " + oneDrinkOrder.getDrink() + " rendelés nem megoldható,,kérlek válassz az alábbiak közül.\n (A jelenlegi rendelhető italmennyiség)");
                System.out.println(kocsma.remainingDrinks);
            } else {
                if (oneDrinkOrder.getDrink().equals("víz")) {
                    System.out.println("a " + oneDrinkOrder.getDrink() + " rendelés sikeres");
                    double fullOrder = oneDrinkOrder.getCnt() * oneDrinkOrder.getDl();
                    System.out.println("a " + oneDrinkOrder.getDrink() + " rendelés ára " + fullOrder * kocsma.vizPrice);
                    price += fullOrder * kocsma.vizPrice;
                    System.out.println("A szervezetedbe 0 % alkohol került");
                } else {
                    System.out.println("a " + oneDrinkOrder.getDrink() + " rendelés megoldható");
                    Double remainingDrink = kocsma.remainingDrinks.get(oneDrinkOrder.getDrink());
                    remainingDrink -= oneDrinkOrder.getCnt() * oneDrinkOrder.getDl();
                    double fullOrder = oneDrinkOrder.getCnt() * oneDrinkOrder.getDl();
                    kocsma.remainingDrinks.put(oneDrinkOrder.getDrink(), remainingDrink);
                    if (oneDrinkOrder.getDrink().equals("pálinka")) {
                        price += fullOrder * kocsma.palinkaPrice;
                        System.out.println(kocsma.getPalinkaAlcPerc() * oneDrinkOrder.getCnt() + " ml alkohol került a szervezetedbe");
                        alcPercentage += kocsma.getPalinkaAlcPerc() * oneDrinkOrder.getCnt();
                    }
                    if (oneDrinkOrder.getDrink().equals("bor")) {
                        price += fullOrder * kocsma.borPrice;
                        System.out.println(kocsma.getBorAlcPerc() * oneDrinkOrder.getCnt() + " ml alkohol került a szervezetedbe");
                        alcPercentage += kocsma.getBorAlcPerc() * oneDrinkOrder.getCnt();
                    }
                    if (oneDrinkOrder.getDrink().equals("sör")) {
                        price += fullOrder * kocsma.sorPrice;
                        System.out.println(kocsma.getSorAlcPerc() * oneDrinkOrder.getCnt() + " ml alkohol került a szervezetedbe");
                        alcPercentage += kocsma.getSorAlcPerc() * oneDrinkOrder.getCnt();
                    }
                    System.out.println("a " + oneDrinkOrder.getDrink() + " rendelés ára " + price);
                }
            }
        }
        kocsma.setMoneyTurnover(kocsma.getMoneyTurnover() + price);
        System.out.println("a teljes rendelés ára " + price);
        pricestotal += price;
        pricesArray.add((int) price);

        System.out.println("Összesen" + alcPercentage + " ml alkohol került a szervezetedbe");
        System.out.println();


    }

    public static ArrayList<Integer> getPricesArray() {
        return pricesArray;
    }

    public static int getPricestotal() {
        return pricestotal;
    }

    public static void setPricestotal(int pricestotal) {
        KocsmaOrder.pricestotal = pricestotal;
    }

    public static void punchUp() {
        pricestotal -= 10000;

    }

    public String[] getOneOrder() {
        return oneOrder;
    }

    public HashMap<String, int[]> getDrinks() {
        return drinks;
    }

    public double getPrice() {
        return price;
    }

    public double getAlcPercentage() {
        return alcPercentage;
    }

    public boolean isDrinkIsOrNot() {
        return drinkIsOrNot;
    }
}
