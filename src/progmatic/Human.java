package progmatic;

public class Human {
    String eyeColor;
    int footSize;
    int weight;
    boolean hungry;

     public Human (String eyeColor,int footSize, int weight){
         this.eyeColor = eyeColor;
         this.footSize = footSize;
         this.weight = weight;
         hungry = true;
     }
     public Human (){
     }
     public  void eat ( ){
         System.out.println("eating");
         hungry = false ;
         weight++;
     }
     public void gyertyafenyesVacsora(Human human){
         System.out.println("Pizza");
//         hungry = false;
//         human.hungry = false;
//         weight ++;
//         human.weight ++;
         human.eat ();
         this.eat();

     }
}
