package AfterTest2;

public class Cat extends Mammal{
    boolean domesticated;
    public  void voice(){
        System.out.println("miau");
    }

    public Cat(String name, int age, boolean domesticated) {
        super(name, age);
        this.domesticated = domesticated;
    }
}
