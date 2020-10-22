package AutosFeladat;

import java.util.ArrayList;

public class CarService {
    ArrayList<Car> parkingLot;

    public CarService() {
        parkingLot = new ArrayList<>(6);
    }

    public void addNewCar (Car c){
        if (parkingLot.size() < 6){
            parkingLot.add(c);
        }
    }
public boolean repairNextCar (){
        if (parkingLot.size()>0) {
            Car car = parkingLot.get(0);
            for (Tire t : car.getTires()) {
                if (t.hasHole) {
                    t.fixHole();
                }
                t.pump();
            }
            if (car.getEngine().getOillevel() < 100) {
                car.getEngine().fillOil();

            }
            parkingLot.remove(0);
            return true;
        }
        return false;
    }
    public int countRemainingCars(){
        return parkingLot.size();
    }
}
