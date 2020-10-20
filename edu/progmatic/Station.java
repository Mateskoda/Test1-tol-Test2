package edu.progmatic;

public class Station {
    public static int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }
    public  void refillCar(int capacityOfTheCar){
        gasAmount-= capacityOfTheCar;
        capacityOfTheCar=100;
    }
}

