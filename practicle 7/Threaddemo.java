import java.lang.Thread;
public class Threaddemo{
    public static void main(String[] args ){
          NewThread t1=new NewThread();
          t1.start();
    }
}
class NewThread extends Thread{
    NewThread(){
        super("Demo thread");
        System.out.println("child Thread "+this);
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("child process"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("child interrupted ");
        }
        System.out.println("existing child thread ");
    }
}