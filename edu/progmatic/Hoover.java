package edu.progmatic;

public class Hoover {
    int capacity = 20;
    boolean electricity = false;
    boolean plugIn = false;
    int dustInTheHoover = 0;
    double min = 0;
    double house =100;
    double speed;
    double dustAmount;

    public boolean isPlugIn (){
        if (plugIn){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean turnOnOrOff (){
        if (electricity){
            return false;
        }
        else {
            return true;
        }
    }
    public double hoovering( String speed,String dustAmount){
        if (speed.equals("lassan")){
            this.speed =0.8;
        }
        if (speed.equals("közepesen")){
            this.speed =1;
        }
        if (speed.equals("gyorsan")){
            this.speed =1.2;
        }
        if (dustAmount.equals("kicsit")){
            this.dustAmount =0.5;

        }
        if (dustAmount.equals("közepesen")){
            this.dustAmount =1;

        }
        if (dustAmount.equals("nagyon")){
            this.dustAmount =1.5;
        }
        min += (capacity/this.dustAmount)/this.speed;
        house-=capacity/this.dustAmount;
        if (house<0){
            System.out.println("fejezd be, ez már tisztaság mánia");
        }
    return min;
    }
}
