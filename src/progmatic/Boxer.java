package progmatic;

import java.util.ArrayList;
import java.util.Objects;

public class Boxer {
//    Egy adatbázis bokszolók adatait tartalmazza. Minden boxolóról nyilvántartjuk a nevét, a súlyát
//    és a nemzetiségét, hogy hány kg-t képes egy nap alatt fogyni, ill hány kg-t képes maximum
//    fogyni.
    String name;
   private int weight;
    private int actuelWeight;
    private  String nationality;
    private int oneDayLossOfWeight;
    private int maxLossOfWeight;
    private int[] weightCategories = {52, 57, 63, 71, 79, 91};
    private int cnt =0;

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getCnt() {
        return cnt;
    }

    public int getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }

    public int getOneDayLossOfWeight() {
        return oneDayLossOfWeight;
    }

    public int getMaxLossOfWeight() {
        return maxLossOfWeight;
    }

    public String getName() {
        return name;
    }

    public Boxer(String name, String nationality, int weight, int oneDayLossOfWeight, int maxLossOfWeight) {
        this.name = name;
        this.weight = weight;
        this.nationality = nationality;
        this.oneDayLossOfWeight = oneDayLossOfWeight;
        this.maxLossOfWeight = maxLossOfWeight;
        actuelWeight= weight;
    }
    public int myWeightCategory(){
        for (int i = 0; i <weightCategories.length ; i++) {
        if (actuelWeight<= weightCategories[i]){
            return i+1;
        }
    }return weightCategories.length+1;
}
public void myMinWeight(int daysToTournament){
    if(daysToTournament*oneDayLossOfWeight>maxLossOfWeight){
         actuelWeight=weight-maxLossOfWeight;
    }else{
        actuelWeight=weight-daysToTournament*oneDayLossOfWeight;
    }
}

    public int getActuelWeight() {
        return actuelWeight;
    }

    public void setActuelWeight(int actuelWeight) {
        this.actuelWeight = actuelWeight;
    }

    public ArrayList<Integer> myPossibleWeightCategories(int daysToTournament) {
      ArrayList<Integer> pWC = new ArrayList<>();
        if(daysToTournament*oneDayLossOfWeight>maxLossOfWeight){
            for (int i = 0; i <=maxLossOfWeight ; ) {
                pWC.add(weight-i);
                i=i+oneDayLossOfWeight;
            }
        }else{if(oneDayLossOfWeight==0) {
            pWC.add(weight);
        }else{
            for (int i = 0; i <daysToTournament ; i++) {

                pWC.add(weight-i*oneDayLossOfWeight);

            }}
        }return pWC;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boxer boxer = (Boxer) o;
        return name.equals(boxer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
