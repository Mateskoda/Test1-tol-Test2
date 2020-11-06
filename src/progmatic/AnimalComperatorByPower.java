package progmatic;

import java.util.Comparator;

public class AnimalComperatorByPower implements Comparator<AnimalsFromTxt> {

    @Override
    public int compare(AnimalsFromTxt o1, AnimalsFromTxt o2) {
        double powerDiff = o1.getMaxSpeed()*o1.getWeightAvg()-o2.getMaxSpeed()*o2.getWeightAvg();
        if (!(powerDiff ==0)){
            return (int)powerDiff;
        }
        return 1;
    }
}
