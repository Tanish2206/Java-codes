class circle2{
  private double r=5;
   
    double pie=3.14;

  void setc(int i){
     r=i;
  }
  double getc(){
     return r;
  }
  double parameter(){
     return 2*pie*getc();
  }
  double area(){
     return pie*getc()*getc();
  }
 

}
class circlle{
    public static void main(String args[]){
     circle2 obj =new circle2();
     double par,are;
     par = obj.parameter();
     System.out.println("the parameter is "+par );
     are=obj.area();
     System.out.println("the area is "+are );
    }
}