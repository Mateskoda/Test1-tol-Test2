package progmatic;

public class Bicikli {
    private int kerekmMeret = 70;
    private int elsoFogas = 32 ;
    private int [ ] hatsoFogas={26,24,22,20,18,16,14} ;
    private int fokozat;


    public Bicikli() {
//         kerekmMeret=;
//        this.elsoFogas = elsoFogas;
//        this.hatsoFogas = hatsoFogas;
    }
    public void setValto(int fokozat){
        this.fokozat=fokozat;
        }
    public double getSpeed(double fordulatPerSec){
        return fordulatPerSec*(elsoFogas/(double)hatsoFogas[fokozat-1])*kerekmMeret*3.14/100*3.6;
    }

    public double getFordulatPerSec(double speed){
        return speed/ (elsoFogas/(double)hatsoFogas[fokozat-1]*kerekmMeret*3.14/100*3.6);

    }
}
