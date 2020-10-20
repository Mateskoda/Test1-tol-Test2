package edu.progmatic;

public class Pirate {
    int alcoholTox ;
    boolean living;
    public Pirate() {
        alcoholTox = 0;
        living = true;
    }

    public void drinkSomeRum () {
        if (living){
        alcoholTox += 1;}
        else {
            System.out.println("he,s dead");
        }}
       public void howsItGoingMate(){

        if (alcoholTox <= 4) {
            System.out.println("Pour me anudder !");
        }
        else{
            System.out.println( "Arghh, I'ma edu.progmatic.Pirate. How d'ya d'ink its goin?");
            alcoholTox = 0;
        }
    }
public void die (){

}
//    brawl(x) – egy kalóz küzd egy másik kalózzal (amennyiben az a kalóz életben van) 1/3 eséllyel megöli a másikat, vagy meghal, vagy mindketten elájulnak

}

