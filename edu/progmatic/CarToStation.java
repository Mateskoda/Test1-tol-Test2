package edu.progmatic;

public class CarToStation {
    public static void main(String[] args) {
    Car ferrari = new Car();
        System.out.println(ferrari.capacity + " "+ ferrari.gasAmount);
        ferrari.capacity-= 50;
        System.out.println(ferrari.capacity + " "+ ferrari.gasAmount);

        Car honda = new Car();
        System.out.println(honda.capacity + " "+ honda.gasAmount);
    Station station1 = new Station(1000);
    station1.refillCar(honda.capacity);
        System.out.println(honda);
    }

}
