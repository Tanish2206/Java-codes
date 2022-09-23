import java.util.*;
interface motorbike{
    
    public void totaldistance(double speed);
}
interface cycle{
   
    public void speed( double distance);
}

class twowheeler implements motorbike,cycle
{
       public void totaldistance(double speed)
       {
           double totaldis;
           double time = 5 ;
           totaldis=speed*time;
           System.out.println("total distance is"+totaldis);
        }
        public void speed( double distance){
            double sppe;
            double time =5;
            sppe=distance/time;
            System.out.println("total speed is"+sppe);


        }

}
 class pra4b{
     public static void main(String args[]){
         twowheeler t=new twowheeler();
         t.totaldistance(40);
         t.speed(40);
     }
 }
