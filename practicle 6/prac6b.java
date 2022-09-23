class Hillstation{
    void location(){
        System.out.println("no location");
    }
    void famousfor(){
        System.out.println("nothing ");
    }
}
class Manali extends Hillstation{
    void location(){
        System.out.println("Himachal pradesh");
    }
    void famousfor(){
        System.out.println("skiing backpacking etc ");
    }
}
class Ooty extends Hillstation{
    void location(){
        System.out.println("Tamil nadu");
    }
    void famousfor(){
        System.out.println("colonial Background ");
    }
}
class Shimla extends Hillstation{
    void location(){
        System.out.println("punjab");
    }
    void famousfor(){
        System.out.println("Chai and Maggi ");
    }
}
public class prac6b{
    public static void main(String[] args){
        Hillstation h=new Hillstation();
        Manali m=new Manali();
        Ooty o=new Ooty();
        Shimla s=new Shimla();
        Hillstation hh;
        hh=m;
        hh.location();
        hh.famousfor();
        hh=o;
        hh.location();
        hh.famousfor();
        hh=s;
        hh.location();
        hh.famousfor();
        hh=h;
        hh.location();
        hh.famousfor();
    }
}