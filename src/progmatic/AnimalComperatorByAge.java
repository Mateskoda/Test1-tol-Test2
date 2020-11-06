package progmatic;
import java.util.Comparator;

public class AnimalComperatorByAge implements Comparator<AnimalsFromTxt> {

    @Override
    public int compare(AnimalsFromTxt o1, AnimalsFromTxt o2) {
        return o1.getName().compareTo(o2.getName());

    }



}
