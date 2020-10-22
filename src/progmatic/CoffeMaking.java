package progmatic;

public class CoffeMaking {
    private int hotDrink;

    public void setHotDrink(int hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void hotDrinkConc (CoffeeMaschine machine){
        if (machine.water / machine.coffee>20){
            System.out.println("Gyenge kávé = híg fost főztél");
        }
        else if ( machine.water/machine.coffee<20){
            System.out.println("Erős kávé = délig tartó lendület");
        }
        else{
            System.out.println("Perfecto espresso");
        }
}}

