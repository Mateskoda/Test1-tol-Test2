package AfterTest2;

public abstract class StringedInstrument extends Instruments{
    int numberOfStrings;
    abstract void sound();
    @Override
    void play() {
        sound();
        sound();sound();
    }
//    Next, we add another abstract class, StringedInstrument which extends Instrument. It
//    introduces numberOfStrings and
//    sound() method what's implementation is yet unknown
//    but with the help of the sound() the play() method is fully implementable
//    StringedInstrument has 3 descendants, namely:-
//    Electric Guitar (6 strings, "Twang")
//    Bass Guitar (4 strings, "Duum-duum-duum")
//    Violin (4 strings, "Screech")
//    The Workshop should be invoked by an App Class which is placed outer than the package:
//            import main.java.music.*;

}
