class box{
    double depth,height,width;
    box(){
      height=-1;
      depth=-1;
      width=-1;

    }
    box(double d,double h,double w){
        this.depth=d;
        this.height=h;
        this.width=w;
    }
    box (double l){
        height=depth=width=l;
    }
    double volume(){
        return height*width*depth;
    }
}


public class Hello {
    public static void main(String[] args){
        double vol;
      box mybox1=new box();
      vol=mybox1.volume();
      System.out.println("volume is "+vol);
      box mybox2=new box(7);
      vol=mybox2.volume();
      System.out.println("volume is "+vol);
      box mybox3=new box(10,20,30);
      vol=mybox3.volume();
      System.out.println("volume is "+vol);
    }
}
