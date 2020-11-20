package progmatic;

public class HooverWithWater extends Hoover2{
int waterLevel = 0;

public int fillTheWaterTank(){
    return waterLevel= 100;
}

    public void hooveringWitWater(int waterLevel) {
            if (waterLevel==0){
                System.out.println("There is no water in the Hoover");
            }
            else{
                if (!getPlugIn()) {
                    System.out.println("Kapcsold be! ");
                }
                else{
                    waterLevel=0;
                    System.out.println("A víztartály kiürült.");
                }
            }
            }
}

