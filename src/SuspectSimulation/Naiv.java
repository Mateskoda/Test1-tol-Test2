package SuspectSimulation;

public class Naiv extends SuspectProfile{
    public Naiv(String name) {
        this.name = name;
    }

    String name;
        int punishment=0;

    public Naiv() {

    }

    @Override
        public boolean confess(Suspect other) {
            return false;
        }

        @Override
        public void setPunishment(Suspect other) {
            if (other.confess(this)){
                noncooperations.putIfAbsent(other,0);
                punishment-=3;
                noncooperations.put(other,noncooperations.get(other)-3);
            }
            else{
                cooperations.putIfAbsent(other,0);
                punishment-=1;
                cooperations.put(other,cooperations.get(other)-1);

            }
//            System.out.println("Naiv");
        }

    @Override
    public String toString() {
        return  name ;
    }
}

