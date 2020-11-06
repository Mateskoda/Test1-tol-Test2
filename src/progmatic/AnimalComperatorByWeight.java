package progmatic;

import java.util.Comparator;

public class AnimalComperatorByWeight implements Comparator<AnimalsFromTxt> {

        @Override
        public int compare(AnimalsFromTxt o1, AnimalsFromTxt o2) {
            int szorzo1= 1;
            int szorzo2 =1;

            if (o1.getWeightAvg()<=50){
                szorzo1= 10000000;
            }
            if (o2.getWeightAvg()<=50){
                szorzo2 = 10000000;
            }
            double powerDiff = szorzo1*o1.getWeightAvg()-szorzo2*o2.getWeightAvg();
            if (!(powerDiff ==0 )){
                return (int)powerDiff;
            }
            return 1;
        }
    }

