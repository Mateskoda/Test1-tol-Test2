package progmatic;

public class Point {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   public void printInfo() {
       System.out.println(x + " ," + y);
       String rightOrleft;
       String upOrDown;
       if (x >= 0) {
           rightOrleft = "right ";
       } else {
           rightOrleft = "left ";
       }
       if (y >= 0) {
           upOrDown = "up ";
       } else {
           upOrDown = "down ";
       }
       if (Math.abs(x)>20 ||Math.abs(y)>20){
           System.out.println("nem tudom kirajzoltatni");
       }
       System.out.println(rightOrleft +upOrDown +  "side");
   }
    public double distance(Point otherPoint){
        double dist ;
    if (x == otherPoint.x){
        dist = Math.abs(y-otherPoint.y);
    }
       else if (y == otherPoint.y){
            dist = Math.abs(x-otherPoint.x);
        }
        else{
            dist = Math.sqrt(Math.pow(x-otherPoint.x,2) + Math.pow(y-otherPoint.y,2));
    }return dist;
    }
    public void print (){
        for (int i = 0; i <41 ; i++) {
            System.out.println("");
            for (int j = 0; j <41 ; j++) {

                if (y==0 &&21-y==i && x + 21 == j){
                    System.out.print(" * ");
                }
                else if (i==21 && ((y!=0) || (x + 21 != j) )){
                    System.out.print("---");
                }
                 else{

                if (x==0 &&21-y==i && x + 21 == j){
                    System.out.print(" * ");
                }

                 else   if (j== 21 ) {
                       System.out.print(" | ");
                   }
                        else if (21-y==i && j==x+21){
                            System.out.print(" * ");
                        }
                        else{
                       System.out.print( "   ");
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
//    }Szorgalmi: Írj egy olyan metódust, ami elmozgatja a pontot egy adott irányba
//    adott távolsággal!
//public void move (int xMove,int yMove){
//
//        }

        }

//    Szorgalmi: Készíts egy print metódust a pont osztályhoz, ami kirajzol egy olyan
//    koordinátarendszert, ahol az x és az y tengely is -20-tól 20-ig tart és
//    kirajzolja a koordinátarendszerben a pontot. Ha a pont kívül esik a -20-20
//    koordinátarendszeren, akkor viszont írd ki, hogy nem tudod kirajzolni és írd ki azt,
//    amit a printInfo kiír.
//    Szorgalmi: Írj egy olyan metódust, ami elmozgatja a pontot egy adott irányba adott távolsággal!
//    Szorgalmi: A fentihez hasonlóan a 2d-s pont osztályba írj egy metódust, ami visszaad egy másik pontot, ami adott irányba adott távolságra helyezkedik el az eredeti ponttól!

}
