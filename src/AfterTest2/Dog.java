package AfterTest2;

public class Dog extends Mammal{

    public  void voice(){
        System.out.println("vauuu");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void playWithDog(){
        System.out.println("the dog bringed you back the ball,throw it again");
    }

}
