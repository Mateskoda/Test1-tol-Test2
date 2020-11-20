package SuspectSimulation;

public class Sértödékeny extends SuspectProfile {
    String name ;

    public Sértödékeny(String name) {
        this.name = name;
    }

    int punishment = 0;

    @Override
    public boolean confess(Suspect other) {
        if (!(noncooperations.isEmpty())) {
            if (noncooperations.containsKey(other)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setPunishment(Suspect other) {
        if (!(noncooperations.isEmpty())) {
            if (noncooperations.containsKey(other)) {
                if (other.confess(this)) {
                    noncooperations.putIfAbsent(other, 0);
                    punishment -= 2;
                    noncooperations.put(other, noncooperations.get(other) - 2);
                } else {
                    cooperations.putIfAbsent(other, 0);
                    punishment -= 0;
                    cooperations.put(other, cooperations.get(other) - 0);


                }
            }} else {
                if (other.confess(this)) {
                    noncooperations.putIfAbsent(other, 0);
                    punishment -= 3;
                    noncooperations.put(other, noncooperations.get(other) - 3);
                    System.out.println("1");
                } else {
                    cooperations.putIfAbsent(other, 0);
                    punishment -= 1;
                    cooperations.put(other, cooperations.get(other) - 1);
                    System.out.println("2");
                }

            }
//            System.out.println("Sertodekeny");

    }
    @Override
    public String toString() {
        return  name ;
    }
}