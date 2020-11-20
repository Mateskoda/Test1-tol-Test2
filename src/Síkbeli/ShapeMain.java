package Síkbeli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeMain {
    static List<Shape> shapeArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/shapes.csv"));
        for (int i = 0; sc.hasNextLine(); i++) {
            String type = sc.nextLine();
            String[] parts = type.split(",");
            Shape s = null;
            if (parts[0].equals("0")) {
                s = new Circle(Integer.parseInt(parts[1]));
            } else if (parts[0].equals("3")) {
                s = new Triangel(Integer.parseInt(parts[1]));
            } else if (parts[0].equals("4")) {
                s = new Square(Integer.parseInt(parts[1]));
            } else if (parts[0].equals("6")) {
                s = new Hexa(Integer.parseInt(parts[1]));
            }
            shapeArrayList.add(s);
        }
printClass();
    }

    static void printInfo(Shape s) {
        System.out.println(s.perimeter());
        System.out.println(s.area());
        System.out.println(s.area() / s.perimeter());
        if (s.perimeter() < s.area()) {
            System.out.println("kövér");
        }
        if (s.area() < s.perimeter()) {
            System.out.println("sovány");
        } else {
            System.out.println("tökéletes");
        }
    }

    //    Írj egy olyan statikus metódust, amely egy bemenetül kapott, Shape-eket tartalmazó
//    listának minden eleméről ki tudja írni az információkat!
    public static void printListInfos(List<Shape> list) {
        for (int i = 0; i < list.size(); i++) {
            printInfo(list.get(i));
        }
    }

    //    Írd meg a public static Shape getLargestShape(List<Shape> shapes) metódust, amely visszaadja
    //    az adott listának a legnagyobb területű alakzatát!
    public static Shape getLargestShape(List<Shape> shapes) {
        double max = shapes.get(0).area();
        ArrayList<Integer> maxInd = new ArrayList();
        Shape shapeMax = null;
        for (int i = 1; i < shapes.size(); i++) {
            if (shapes.get(i).area() >= max) {
                max = shapes.get(i).area();
                shapeMax = shapes.get(i);
            }
        }
        for (int i = 1; i < shapes.size(); i++) {
            if (shapes.get(i).area() == max) {
                maxInd.add(i);

            }
        }
        System.out.println(maxInd);
        return shapeMax;
    }

//    Hogyan módosítanád a Shape interfacet, ha a kiíratásnál az alakzat nevét
//    (kör, négyzet, háromszög, stb…) is ki szeretnéd írni?
public static void printClass(){
    System.out.println(shapeArrayList.get(0).classname());
}

}

