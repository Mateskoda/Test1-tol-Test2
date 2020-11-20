package SuspectSimulation;

public class BadGuy extends SuspectProfile{
    String name;
    int punishment=0;

    public BadGuy(String name) {
        this.name = name;
    }

    @Override
    public boolean confess(Suspect other) {
        return true;
    }

    @Override
    public void setPunishment(Suspect other) {
       if (other.confess(this)){
        noncooperations.putIfAbsent(other,0);
        punishment-=2;
        noncooperations.put(other,noncooperations.get(other)-2);
       }
        else{
            cooperations.putIfAbsent(other,0);
            punishment-=0;
            cooperations.put(other,cooperations.get(other)-0);

        }
//        System.out.println("Badguy");
    }

    @Override
    public String toString() {
        return  name ;
    }
}
