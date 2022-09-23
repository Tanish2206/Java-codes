import java.util.*;

abstract class instrument{
    abstract void play();
}
class piano extends instrument{
     void play(){
         System.out.println("piano is playing tan tan tan tan ");
     }
}
class guitar extends instrument{
    void play(){
        System.out.println("guitar is playing tin tin tin tin ");
     }
}
class flute extends instrument{
    void play(){
        System.out.println("flute  is playing toot toot toot toot ");
     }
}
class pra4{
    public static void main(String args[]){
        piano c=new piano();
        c.play();
        flute r=new flute();
        r.play();
        guitar g=new guitar();
        g.play();
    }
}