package edu.progmatic;

public class Domino {
    final int left;
    final int right;


//    Hozz létre egy edu.progmatic.Domino classt
//    melynek 2 int final fieldje van, melyben a domino jobb és bal oldalán lévő
//    számok szerepelnek
//2 metódust tartalmaz, mely vissza adja a jobb vagy a bal oldalát.
//    Hozz létre egy edu.progmatic.Dominos classt melyben példányosítod a következő dominókat:
//            (5, 2)
//            (4, 6)
//            (1, 5)
//            (6, 7)
//            (2, 4)
//            (7, 1)
//    Tedd ezeket a dominókat egy tömbe, majd írj egy metódust, ami orba rendezi őket valahogy így : [2, 4], [4, 3], [3, 5] ...
//

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int returnLeft (){
        return left;
    }
    public int returnRight (){
        return right;}

    @Override
    public String toString() {
        return "edu.progmatic.Domino{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
// toString

}
