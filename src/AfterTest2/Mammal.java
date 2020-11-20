package AfterTest2;

public abstract class Mammal extends Animal {
    public abstract void voice();

    public Mammal(String name, int age) {
        super(name, "Mammal", "szárazföldi", age);
//        this.setType("Mammal");
//        this.setArea("szárazföldi");
    }
}
