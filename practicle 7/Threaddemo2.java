import java.lang.Thread;
public class Threaddemo2{
    public static void main(String[] args ){
          NewThread t1=new NewThread("Tanish");
          t1.setPriority(2);
          t1.start();
          NewThread t2=new NewThread("hello");
          t2.setPriority(6);
          t2.start();
          NewThread t3=new NewThread("bye");
          t3.setPriority(10);
          t3.start();
    }
}
class NewThread extends Thread{
    NewThread(String name){
        super(name);
       
    }
    public void run(){
        try{
           
            System.out.println("Thread "+Thread.currentThread()+"is running");
           sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("child interrupted ");
        }
       
    }
}