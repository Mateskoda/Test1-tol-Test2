package progmatic;

import java.util.ArrayList;

public class Artist {
   String name;
    int dateOfPrize;
    String typeOfPrize;
    ArrayList<String> work = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfPrize(int dateOfPrize) {
        this.dateOfPrize = dateOfPrize;
    }

    public void setTypeOfPrize(String typeOfPrize) {
        this.typeOfPrize = typeOfPrize;
    }

    public void setWork(ArrayList<String> work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public int getDateOfPrize() {
        return dateOfPrize;
    }

    public String getTypeOfPrize() {
        return typeOfPrize;
    }

    public ArrayList<String> getWork() {
        return work;
    }

    public Artist() {

    }
}
