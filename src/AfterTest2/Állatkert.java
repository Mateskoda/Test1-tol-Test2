package AfterTest2;

import java.util.ArrayList;

public class Állatkert {
    static ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {

        Dog manfred = new Dog("Manfred", 1);
        Cat andromeda = new Cat("Andromeda", 2, true);
        Cat andromeda2 = new Cat("Andromeda", 2, true);
        Cat andromeda3 = new Cat("Andromeda", 2, false);
        Cat andromeda4 = new Cat("Andromeda", 2, false);
        Cat andromeda5 = new Cat("Andromeda", 2, false);
        Cat andromeda6 = new Cat("Andromeda", 2, false);
        Canary pitypang = new Canary("Pitypang", 2, 11);
        Canary pitypang2 = new Canary("Pitypang", 2, 2);
        Canary pitypang3 = new Canary("Pitypang", 2, 3);
        Canary pitypang4 = new Canary("Pitypang", 2, 4);
        Parrot kópé = new Parrot("Kópé", 3,1);
//        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(manfred);
        animals.add(andromeda);
        animals.add(andromeda2);
        animals.add(andromeda3);
        animals.add(andromeda4);
        animals.add(andromeda5);
        animals.add(andromeda6);
        animals.add(pitypang);
        animals.add(pitypang2);
        animals.add(pitypang3);
        animals.add(pitypang4);
        animals.add(kópé);
//        this.animals=animals;
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).age);
            System.out.println(animals.get(i).type);
            System.out.println(animals.get(i).area);
            System.out.println(animals.get(i).name);
            animals.get(i).voice();
        }
        int mammalCnt = 0;
        int birdCnt = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getType().equals("Mammal")) {
                mammalCnt++;
            }
            if (animals.get(i).getClass().getSuperclass().toString().equals("class AfterTest2.Birds")) {
                birdCnt++;
            }
        }
        System.out.println(birdCnt + "  " + mammalCnt);
        System.out.println(pitypang.getClass().getSuperclass());
        System.out.println();
        System.out.println(playWithDog());
        System.out.println();
        System.out.println(birdsAvgOfSpan());
        System.out.println();
        System.out.println(catsAvgOfDomestication());
    }

    //    Kisméretű állatkertünkben több állat található.
//    Van több kutya, macska, papagáj, kanári.
//    Modellezd le osztályokkal ezt a mini állatseregletet,
//    méghozzá ö  public abstract void voice();  public abstract void voice();rökléssel!
//    A kutya és a macska emlősök, a kanári és a papagáj pedig
//    madarak. Ezeket a kapcsolatokat jelenítsd majd meg az
//    osztályhierarchiában!
//    Minden állatnak van fajtája, élőhelye és kora. Ezen felül
//    minden állatot rá lehet bírni, hogy adjon ki hangot.
//    A madaraknak van szárnyfesztávjuk.
//    A macskáknak van olyan attribútumuk, hogy háziasított,
//    vagy sem.   public abstract void voice();A kutya abban speciális, hogy vele játszani
//    is lehet.
//
//            1. Tervezd meg (UML diagram), majd írd meg az osztályokat a fentiek figyelembe vételével.
//
//            2. Egy megfelelő adatszerkezetet tölts fel néhány állattal. Majd írasd ki a közös jellemzőiket.
//
//            3. Minden állatot bírjunk rá, hogy adja ki a rá jellemző hangot!
//
//            4. Mondd meg mennyi emlős és mennyi madár alkotja az állatseregletet.
//
//            5. Vegyél fel több macskát, háziasítottat és nem háziasítottat is.
//            Írasd ki hány százaléka a macskáknak háziasított!
    public static double catsAvgOfDomestication() {
        int catCnt = 0;
        double domesticCatCnt = 0;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().toString().equals("class AfterTest2.Cat")) {
                catCnt++;
                Cat cat = (Cat) animals.get(i);
                if (cat.domesticated) {
                    domesticCatCnt++;
                }
            }
        }
        return 100 * domesticCatCnt / catCnt;

    }

    //            6. Vegyél fel több madarat, majd írasd ki az átlagos szárnyfesztávot.
//
    public static double birdsAvgOfSpan() {
        int birdsCnt = 0;
        double spanSum = 0;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().getSuperclass().toString().equals("class AfterTest2.Birds")) {
                birdsCnt++;
                Birds b = (Birds) animals.get(i);
                spanSum += ((Birds) (animals.get(i))).span;
            }
        }
        return spanSum / birdsCnt;

    }

    //7. Menj végig az állatseregleten és játssz a kutyákkal. (tipp: System out-ra kiírva jelezd a játék megtörténtét)
//
//
    public static double playWithDog() {
        int playCnt = 0;

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getClass().toString().equals("class AfterTest2.Dog")) {
                playCnt++;
                ((Dog) (animals.get(i))).playWithDog();
                System.out.println("You played with dog");
            }
        }
        return playCnt;


    }
}
