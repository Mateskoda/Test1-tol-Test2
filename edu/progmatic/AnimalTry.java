package edu.progmatic;

public class AnimalTry {
    public static void main(String[] args) {
        Animal anim1 = new Animal();

        System.out.println(anim1.hungryCnt);
        anim1.drink();
        System.out.println(anim1.thirstyCnt);
        anim1.eat();
        System.out.println(anim1.hungryCnt);
        Animal anim2 = new Animal();
        System.out.println(anim2.hungryCnt+"  "+anim2.thirstyCnt);
        anim1.play();
        anim2.play();
        System.out.println(anim1.hungryCnt);
        System.out.println(anim1.thirstyCnt);
        System.out.println(anim2.hungryCnt+"  "+anim2.thirstyCnt);

    }
}
