package edu.progmatic;

public class CoffeeMaschine {
    int water;
    int coffee;


    public CoffeeMaschine() {
        water = 0;
        coffee = 0;
    }

    public void setWater(int water) {
        this.water += water;
    }

    public void setCoffee(int coffee) {
        this.coffee += coffee;
    }
    public void hotDrinkConc (){
        if ((double)water / coffee>0.20){
            System.out.println("Gyenge kávé = híg fost főztél");
        }
        else if ( (double)water/coffee<0.20){
            System.out.println("Erős kávé = délig tartó lendület");
        }
        else{
            System.out.println("Perfecto espresso");
        }
    }}



