package progmatic;

import java.util.Comparator;

public class  AnimalComperatorByPower2 implements Comparator<AnimalsFromTxt> {

    @Override
    public int compare(AnimalsFromTxt o1, AnimalsFromTxt o2) {
        int szorzo1= 1;
        int szorzo2 =1;

        if (o1.getWeightAvg()<=50){
             szorzo1= -10;
        }
        if (o2.getWeightAvg()<=50){
             szorzo2 = -10;
          }
        double powerDiff = szorzo1*o1.getMaxSpeed()-szorzo2*o2.getMaxSpeed();
        if (!(powerDiff ==0 )){
            return (int)powerDiff;
        }
        return 1;
    }
}

