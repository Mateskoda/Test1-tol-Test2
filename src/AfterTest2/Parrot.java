package AfterTest2;

public class Parrot extends Birds{
    public  void voice(){
        System.out.println("pitttyyyu");
    }

    public Parrot(String name, int age,int span) {
        super(name, age);
        super.voice= "pitttyyyu";
        this.span = span;
    }
}
