package progmatic;

public class CityBike extends Bicikli{
    private boolean light;
    private int ringerCnt=0;

    public CityBike() {
        super();

    }
    public boolean getLight ( ){
        return light;
    }
    public void turnLightOnOrOff(){
        if (getLight()){
            light= false;
        }else{
            light = true;
        }
    }
    public void ring ( ){
        System.out.println("Csengetett,mylord?");
        ringerCnt++;
    }
//    Készíts most egy városi bicikli (CityBike) osztályt. A városi bicikli ugyanolyan bicikli mint minden bicikli, csak van rajta világítás és csengő.
//    A világítást be lehet kapcsolni és ki lehet kapcsolni, továbbá meg lehet nézni, hogy épp be van-e kapcsolva
//    . A csengővel pedig lehet csengetni. A városi bicikli osztályod megvalósításánál használj öröklődést!

}
