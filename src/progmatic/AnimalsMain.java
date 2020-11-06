package progmatic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AnimalsMain {

//    private static ArrayList<AnimalsFromTxt> animals ;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("animals.txt"));
        Scanner sc2 = new Scanner(new File("foldresz.txt"));
        ArrayList<AnimalsFromTxt> animals = new ArrayList<AnimalsFromTxt>();
        for (int i = 0; sc.hasNextLine(); i++) {
            AnimalsFromTxt animal = new AnimalsFromTxt();
            String line = sc.nextLine();
            String[ ] parts = line.split(",");
                animal.setName(parts[0]);
                animal.setType(parts[1]);
                animal.setWeightAvg(Double.parseDouble(parts[2]));
                animal.setMaxSpeed(Double.parseDouble(parts[3]));
                animal.setAgeAvg(Double.parseDouble(parts[4]));
                animals.add(animal);
            }
//        this.animals= animals;
        ArrayList<AnimalsFromTxt> animals2 = new ArrayList<>();

        for (int i = 0; sc2.hasNext(); i++) {
            AnimalsFromTxt animal = new AnimalsFromTxt();
            String line = sc2.nextLine();
            String[ ] parts = line.split(",");
            animal.setName(parts[0]);
            for (int j = 1; j <parts.length ; j++) {
            animal.list.add(parts[j]);
            animals2.add(animal);
            }
        }
//        for (int i = 0; i <animals.size() ; i++) {
//            System.out.println(animals.get(i).getName());
//        }
//        Collections.sort(animals, new AnimalComperatorByAge());
//        for (int i = 0; i <animals.size() ; i++) {
//
//            System.out.println(animals.get(i).list);
//
//        }
        Collections.sort(animals2, new AnimalComperatorByAge());
        for (int i = 0; i <animals.size() ; i++) {
            animals.get(i).list = animals2.get(i).list;
            animals2.remove(i);
//
        }
        for (int i = 0; i <animals.size() ; i++) {
            System.out.println(animals.get(i).getName());
            System.out.println(animals.get(i).list);}
            System.out.println(Arrays.toString(fastestAndSlowest(animals)));
        System.out.println(Arrays.toString(earthFastestAndSlowest(animals)));
        System.out.println(Arrays.toString(europaFastestAndSlowest(animals)));
        System.out.println(Arrays.toString(mostPowerful(animals)));
        System.out.println(Arrays.toString(moreThan50kgMostPowerful(animals)));
    }
//
//    Melyik a három leggyorsabb állat? És a három leglassabb?g

    public static String [] fastestAndSlowest (ArrayList<AnimalsFromTxt> animals){
        Collections.sort(animals, new AnimalComperatorBySpeed());
        String [] fastest = new String[6];
        for (int i = 0, j= 0; i <3 ; i++,j++) {
            fastest[i] = animals.get(animals.size() - 1 - i).getName();
        } for (int i = 0; i <3 ; i++) {
            fastest[i+3] = animals.get(i).getName();

        }return fastest;

    }
//    Melyik a három leggyorsabb szárazföldi állat? És a három leglassabb?

    public static String [] earthFastestAndSlowest (ArrayList<AnimalsFromTxt> animals){
//        Collections.sort(animals, new AnimalComperatorBySpeed());
        String [] fastest = new String[6];
        for (int i = 0,j =0; j <3 ; i++) {
            while (!(animals.get(animals.size()-1-i).getType().equals("szárazföldi"))){
                i++;
            }
            fastest[j] = animals.get(animals.size() - 1 - i).getName();
            j++;
        } for (int i = 0,j = 3; j <6 ; i++) {
            while (!(animals.get(i).getType().equals("szárazföldi"))){
                i++;
            }
            fastest[j] = animals.get(i).getName();
            j++;
        }return fastest;

    }
//    Melyik a három leggyorsabb állat, ami él Európában?//    És a három leglassabb?
public static String [] europaFastestAndSlowest (ArrayList<AnimalsFromTxt> animals){
    Collections.sort(animals,  new AnimalComperatorBySpeed());
    String [] fastest = new String[6];
    for (int i = 0,j =0; j <3 ; i++) {
        while (!(animals.get(animals.size()-1-i).list.contains("Európa"))){
            i++;
        }
        fastest[j] = animals.get(animals.size() - 1 - i).getName();
        j++;
    } for (int i = 0,j = 3; j <6 ; i++) {
        while (!(animals.get(i).list.contains("Európa"))){
            i++;
        }
        fastest[j] = animals.get(i).getName();
        j++;
    }return fastest;

}

//    Ha a fenti adatok alapján úgy következtetünk egy állat erejére,
//    hogy a legnagyobb sebességét szorozzuk a állat átlagos
//    tömegével, akkor melyik a három legerősebb állat?
//    És a három leggyengébb?

    public static String [] mostPowerful (ArrayList<AnimalsFromTxt> animals){
        Collections.sort(animals, new AnimalComperatorByPower());
        String [] mostPowerful = new String[6];
        for (int i = 0, j= 0; i <3 ; i++,j++) {
            mostPowerful[i] = animals.get(animals.size() - 1 - i).getName();
        } for (int i = 0; i <3 ; i++) {
            mostPowerful[i+3] = animals.get(i).getName();

        }return mostPowerful;

    }

//    Az 50 kg-nál nehezebb állatok közül melyik a legkönnyebb?
//    Az 50 kg-nál nehezebb állatok közül melyik a leggyorsabb?

//    Meg tudod oldani ezt a feladatot úgy, hogy az algoritmus
//    ugyanaz legyen mint az előzőnél, csak a comparator változzon?

    public static String [] moreThan50kgMostPowerful (ArrayList<AnimalsFromTxt> animals){
        Collections.sort(animals, new AnimalComperatorByWeight());
        String [] minWeightAndFastest = new String[6];
        for (int i = 0, j= 0; i <3 ; i++,j++) {
            minWeightAndFastest[i] = animals.get(i).getName();}
        Collections.sort(animals, new AnimalComperatorByPower2());
         for (int i = 0; i <3 ; i++) {
            minWeightAndFastest[i+3] = animals.get(animals.size()-1-i).getName();

        }return minWeightAndFastest;

    }
}
