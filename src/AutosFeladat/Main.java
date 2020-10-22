package AutosFeladat;

public class Main {
    public static void main(String[] args) {

        Car car = new Car ();
        for (Tire t: car.getTires()){
            if (t.hasHole){
                t.fixHole();
            }
            t.pump();
        }
        if (car.getEngine().fillOil());
        
        CarService belaba = new CarService();
        for (float time = 7; time <=19 ; time+= 0.5) {
          double r = Math.random();
            if (r<0.6){
                belaba.addNewCar (new Car());
            }
        else {
                System.out.println("nem állautó");
            }
        }
    }
}
