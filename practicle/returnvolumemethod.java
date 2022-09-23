import java.util.*;
class box{
    double width;
    double height;
    double depth;
 
 double volume(){
     
     return width*height*depth;

 }
}

class Boxdemo3{
    public static void main(String args[]){
        box mybox1 = new box();
        box mybox2 = new box();

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the values ");
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String num3 = sc.nextLine();
        double a = Integer.parseInt(num1);
        double b = Integer.parseInt(num2);
        double c = Integer.parseInt(num3);
        mybox1.width=a;
        mybox1.height=b;

        mybox1.depth=c;

        System.out.println("enter the values of box 2 ");
        String num4 = sc.nextLine();
        String num5 = sc.nextLine();
        String num6 = sc.nextLine();
        double d = Integer.parseInt(num4);
        double e = Integer.parseInt(num5);
        double f = Integer.parseInt(num6);
        mybox2.width=d;
        mybox2.height=e;

        double vol;
        
        mybox2.depth=f;
        vol=mybox1.volume(); 
        System.out.println("volume is "+vol);
        vol=mybox2.volume(); 
        System.out.println("volume is "+vol);

    }
}