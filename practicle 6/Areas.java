class Figure{
    double dim;
    double dim1;

    Figure(double a,double b){
        dim=a;
        dim1=b;
    }
    double area(){
        System.out.println("area of figure is undefined ");
        return 0;
    }

}
class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
        
    }
    double area(){
        System.out.println("inside area of rectangle ");
        return dim*dim1;
    }

}
class Triangle extends Figure{
    Triangle (double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("inside area of Triangle  ");
        return dim*dim1*0.5;
    }

}

public class Areas {
    public static void main(String[] args){
        Figure f=new Figure(10,10);
        Rectangle r=new Rectangle(9,5);
        Triangle t=new Triangle(8,4);

        System.out.println("area of rectangle "+r.area());
        System.out.println("area of triangle  "+t.area());
        System.out.println("area of figure "+f.area());
    }
}