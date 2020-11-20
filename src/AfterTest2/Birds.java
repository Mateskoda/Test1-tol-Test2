package AfterTest2;

public abstract class Birds extends Animal {
    int span;

    public Birds(String name,int age) {
        super(name, "Birds", "Szárazföld,levegő", age);
//        this.setType("Bird");
//    this.setArea("Szárazföld,levegő");
    }

    public abstract void voice();
}

