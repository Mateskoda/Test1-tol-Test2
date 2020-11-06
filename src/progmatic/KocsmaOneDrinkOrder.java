package progmatic;

public class KocsmaOneDrinkOrder {
//    String [] parts;
    double dl ;
    int cnt = 0;
    String drink;
    public KocsmaOneDrinkOrder(Kocsma kocsma,String[] parts) {
        dl = Integer.parseInt(parts[0].trim());
        drink = parts[1].trim();
        cnt = Integer.parseInt(parts[2].trim());
        if (drink.equals("pálinka")){
            dl*= 0.5;
        }
        if (drink.equals("bor")){
            dl*= 2;
        }
            if (drink.equals("sör")){
                dl*=5;
        }

    }

    public double getDl() {
        return dl;
    }

    public int getCnt() {
        return cnt;
    }

    public String getDrink() {
        return drink;
    }

    public boolean drinkIsOrNot(Kocsma kocsma){
        if (kocsma.getRemainingDrinks().get(drink)>=dl*(double)cnt){
            return true;
        }
        return false;
    }
}
