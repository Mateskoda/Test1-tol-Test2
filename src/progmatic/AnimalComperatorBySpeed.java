package progmatic;

import java.util.Comparator;

public class AnimalComperatorBySpeed implements Comparator<AnimalsFromTxt>{
    @Override
    public int compare(AnimalsFromTxt o1, AnimalsFromTxt o2) {
        double speedDiff = o1.getMaxSpeed() - o2.getMaxSpeed();
        if(speedDiff != 0){
            return (int) speedDiff;
    }else {
            return 1;
        }
}}
