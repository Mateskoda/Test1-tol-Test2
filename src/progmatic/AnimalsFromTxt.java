package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalsFromTxt{
    String name;
    String type;
    double weightAvg;
    double maxSpeed;
    double ageAvg;
    ArrayList<String> list= new ArrayList<>();

    public String getType() {
        return type;
    }

    public double getWeightAvg() {
        return weightAvg;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getAgeAvg() {
        return ageAvg;
    }

    public ArrayList<String> getList() {
        return list;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeightAvg(double weightAvg) {
        this.weightAvg = weightAvg;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAgeAvg(double ageAvg) {
        this.ageAvg = ageAvg;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public AnimalsFromTxt() throws FileNotFoundException {



    }

    public String getName() {
        return name;
    }

//    Fajta,típus(légi, szárazföldi, vízi), áltagos tömeg, maximális sebesség, átlag-életkor
//    A második fájl azt taralmazza, hogy egy állat fajta mely földrészeken fordul elő
//    A második fájl egy példa sora:
//    Havasi sarlósfecske, Európa, Ázsia, Dél-amerika

}
