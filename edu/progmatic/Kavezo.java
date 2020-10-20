package edu.progmatic;

import java.util.Scanner;

public class Kavezo {


    public static void main(String[] args) {
        CoffeeMaschine gép = new CoffeeMaschine();
        System.out.println("öncsé vizet(írd be ,mennyi dl vizet öntöttél!");
        Scanner sc = new Scanner(System.in);
        int waterVolume= sc.nextInt();
        gép.setWater(waterVolume);

        System.out.println("tegyél kávét gépbe !(írd be ,mennyi g kávét raktál!");
        int coffeeVolume= sc.nextInt();
        gép.setCoffee(coffeeVolume);

//        System.out.println("");
//        System.out.println("Add meg ,mennyi dl kávét kérsz");
//        Scanner sc = new Scanner(System.in);
//        int coffeVolume= sc.nextInt();

//        if (coffeVolume>gép.setWater();)
        gép.hotDrinkConc();
    }
}
