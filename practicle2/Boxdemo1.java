class Box{
    double width;
    double height;
    double depth;
    
    Box(){
        System.out.println("constructing box");
        width=10;
        height=10;
        depth=10;
    }
    Box(double i,double j,double k){
        System.out.println("parameterized box");
        width=i;
        height=j;
        depth=k;

    }
    double volume(){
        return width*height*depth;
    }
}
class Boxdemo1{
    public static void main(String args[]){
        Box mybox1=new Box();
        Box mybox2=new Box(10,10,10);
        double vol;

        vol=mybox1.volume();
        System.out.println("volume is "+vol);
         vol=mybox2.volume();
        System.out.println("volume is "+vol);


    }
}