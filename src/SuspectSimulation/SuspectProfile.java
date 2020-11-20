package SuspectSimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class SuspectProfile implements Suspect {

    Map<Suspect,Integer> cooperations= new HashMap<>();
    Map<Suspect,Integer> noncooperations = new HashMap<>();


}
