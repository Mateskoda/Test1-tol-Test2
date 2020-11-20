package Intelligent;

public class Parrot implements IntelligentBeing {
    @Override
    public void response(String input, IntelligentBeing i) {
        System.out.println(input);
    }
}
