class box{
    double width;
    public double height;
    private double depth;
  void setc(int i){
     depth=i;
 }
 double getc(){
     return depth;
 }
 double volume(){
     
     return width*height*getc();

 } 
} 

 
class Boxdemo3{
    public static void main(String args[]){
        box mybox1 = new box();
        box mybox2 = new box();

        double vol;
        mybox1.width=2;
        mybox1.height=3;
        mybox1.setc(5);
       
        mybox2.width=4;
        mybox2.height=1;
        mybox2.setc(6);

        vol=mybox1.volume(); 
        System.out.println("volume is "+vol);
        vol=mybox2.volume(); 
        System.out.println("volume is "+vol);


    }
}