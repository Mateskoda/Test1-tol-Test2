package Vehicle;

public class SportAuto extends VehicleMetods{
    @Override
    public int getMaxSpeed() {
        return 130;
    }

    @Override
    public int getNrOfSeats() {
        return 3;
    }

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public int getCapacityOfBoot() {
        return 1000;
    }

    @Override
    public int calcPrice(int age) {
        return 8000/age;
    }}