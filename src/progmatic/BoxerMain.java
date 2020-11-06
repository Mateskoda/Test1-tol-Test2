package progmatic;

import java.util.ArrayList;

public class BoxerMain {
    public static void main(String[] args) {
        ArrayList<Boxer> boxers = new ArrayList<Boxer>();
        boxers = Boxers.boxers;
        System.out.println(Boxers.avgKgs());
        System.out.println(Boxers.maxWeight());

    }
}
