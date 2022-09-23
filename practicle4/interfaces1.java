import java.util.*;
interface circle{
    public void area();
}
interface  rectangle {
    
    public void area2();
        
}
class demo implements circle,rectangle{
   public void area(){
        double area;
        int r;
        System.out.println("enter radius of circle ");
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        area =3.14*r*r;
        System.out.println("area of circle"+area);
   }
   public void area2(){
        
        int l=5;
        int b=5;
        int area;
        area=l*b;
        System.out.println("area of rectangle "+area);
    }
}


class interfaces1{
    public static void main(String args[]){
        demo c=new demo();
        c.area();
        c.area2();
    }
}