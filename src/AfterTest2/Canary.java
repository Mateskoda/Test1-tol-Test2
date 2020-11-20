package AfterTest2;

public class Canary extends Birds{
    public  void voice(){
        System.out.println("fitty,fity, prprppprpr");
    }

    public Canary(String name, int age,int span) {
        super(name, age);
        this.span=span;
    }
}
