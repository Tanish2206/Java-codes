
class box{
    double width;
    double height;
    double depth;
 
 double volume(){
     
     return width*height*depth;

 }
 void setdim(double w,double h, double d){
     width=w;
     height=h;
     depth=d;
 }
}

class Boxdemo3{
    public static void main(String args[]){
        box mybox1 = new box();
        box mybox2 = new box();

        double vol;
        mybox1.setdim(10,20,15);
        mybox2.setdim(3,6,9);
        vol=mybox1.volume(); 
        System.out.println("volume is "+vol);
        vol=mybox2.volume(); 
        System.out.println("volume is "+vol);


    }
}