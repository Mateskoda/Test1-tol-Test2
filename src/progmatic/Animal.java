package progmatic;

public class Animal {
   int hungryCnt;
   int thirstyCnt;

 public Animal() {
  hungryCnt=50;
  thirstyCnt=50;
 }
 public  void eat ( ){
  System.out.println("eating");
  hungryCnt -=1 ;
   }
 public  void drink ( ){
  System.out.println("drinking");
  thirstyCnt -=1 ;
 }
 public  void play ( ){
  System.out.println("playing");
  thirstyCnt +=1 ;
hungryCnt +=1 ;

 }


}
