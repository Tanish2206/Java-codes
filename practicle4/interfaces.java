import java.util.*;
interface shapes{
     public void area();
}
class circle implements shapes{
    
    double area;
    int r;
    
    public void area(){
        System.out.println("enter radius of circle ");
        Scanner sc= new Scanner(System.in);
        this.r=sc.nextInt();
        area =3.14*r*r;
        System.out.println("area of circle"+area);
    }
}
class rectangle implements shapes{
    int l=5;
    int b=5;
    int area;
    public void area(){
        area=l*b;
        System.out.println("area of rectangle "+area);
    }
}

class interfaces{
    public static void main(String args[]){
        circle c=new circle();
        c.area();
        rectangle r=new rectangle();
        r.area();
    }
}