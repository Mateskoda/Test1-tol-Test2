package Vehicle;

public class FathersCar extends VehicleMetods{
    @Override
    public int getMaxSpeed() {
        return 160;
    }

    @Override
    public int getNrOfSeats() {
        return 5;
    }

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public int getCapacityOfBoot() {
        return 1000;
    } {
    }


    @Override
    public int calcPrice(int age) {
        return 6000/age;
    }
}

