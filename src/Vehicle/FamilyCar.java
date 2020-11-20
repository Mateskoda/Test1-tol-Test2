package Vehicle;

public class FamilyCar extends VehicleMetods{
    @Override
    public int getMaxSpeed() {
        return 150;
    }

    @Override
    public int getNrOfSeats() {
        return 5;
    }

    @Override
    public int getWeight() {
        return 1200;
    }

    @Override
    public int getCapacityOfBoot() {
        return 300;
    }

    @Override
    public int calcPrice(int age) {
        return 8000/age;
    }}