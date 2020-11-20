package Vehicle;

public abstract class VehicleMetods implements Vehicle {
    public void MadeFor() {
        if (getMaxSpeed() > 150 && getNrOfSeats() < 3) {
            System.out.println("sportcar");
        } else if (getCapacityOfBoot() > 800) {
            System.out.println("pickup");
        } else if (getNrOfSeats() >= 5) {
            System.out.println("familycar");
        }


    }
}
