 class Shapes{
    int length,breadth,radius;
    double base,height;
    


    Shapes(int l,int b){
        System.out.println("rectangle created");
        length=l;
        breadth=b;
    }
    Shapes(double b,double h){
        System.out.println("triangle created ");
        base = b;
        height=h;
    }
    Shapes (int r){
        System.out.println("circle created ");
       radius =r;        
    }
    int area(int l , int b){
        return l*b;
    }
    double area (double b,double h){
        return 0.5*b*h;
    }
    int  area (int  r){
        return (22/7)*r*r;
    }
   
}
public class prac6a{
    public static void main(String[] args ){
        int area;
        double are;
        Shapes s1=new Shapes(10,20);
        area = s1.area(5,10);
        System.out.println("Area of rectangle "+area);
        Shapes s2=new Shapes(5);
        area=s2.area(6);
        System.out.println("Area of circle  "+area);
        Shapes s3=new Shapes(10.1,10.2);
        are=s3.area(12.2,12.5);
        System.out.println("Area of triangle  "+are);

    }
}