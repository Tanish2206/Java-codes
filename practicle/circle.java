class circle{
    private double r=5;
   
    double pie=3.14;
 double parameter(){
    return 2*pie*r;
 }
 double area(){
     return pie*r*r;
 }
 public static void main(String args[]){
     circle obj =new circle();
     double par,are;
     par = obj.parameter();
     System.out.println("the parameter is "+par );
     are=obj.area();
     System.out.println("the area is "+are );

 }


}