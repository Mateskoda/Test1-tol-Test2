package progmatic;

public class PointTest {
    public static void main(String[] args) {
        Point test1 = new Point(-1,0);
        Point test2 = new Point(   0,0);
        Point test3 = new Point(0,10);
        Point test4 = new Point(4,5);
        Point test5 = new Point(5,6);
       test1.printInfo();
        test2.printInfo();
        test3.printInfo();
        test4.printInfo();
        test5.printInfo();
        System.out.println(test1.distance(test2));
        System.out.println( test1.distance(test3));
        System.out.println(test1.distance(test5));
        test1.print();
        test2.print();
        test3.print();

    }
}
