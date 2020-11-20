package progmatic;

public class Hoover2 {

//    Porszívó
//    Készíts egy porszívó osztályt!
//    Egy porszívót be/ki lehet kapcsolni, és van egy portartálya, amit lehet üríteni. Ha bekapcsoljuk és a portartály nincs tele,
//    akkor szívja a port. Ha a portartály tele van, akkor nem szív több port és jelzi, hogy tele a portartály.
//    Készítsd el a vizes porszívó osztályt is. Egy vizes porszívó tud hagyományosan port szívni és vízzel mosni is. A vizes mosáshoz
//    kell hogy legyen benne víz, ami a vizes mosás során fogy. A vizes porszívó megvalósításához használj öröklődést!

    int capacity = 20;
    boolean plugIn = false;
    //    int dustInTheHoover = 0;
    double countMinutes = 0;
    double houseSqM = 100;
    double speed;
    String dustAmount= "empty";
public boolean getPlugIn(){
    return plugIn;
}
    public boolean turnPlugIn() {
        if (plugIn) {
            return false;
        } else {
            return true;
        }
    }


    public String getDustAmount() {
        return dustAmount;
    }

    public void hoovering( String dustAmount) {
    if (dustAmount.equals("full")){
        System.out.println("The dust bag is full, you have to empty first");
    }
    else{
        if (!getPlugIn()) {
                System.out.println("Kapcsold be! ");
            }
        else{
            dustAmount="full";
            System.out.println("A portartály megtelt.");
        }
        }
    }
}


