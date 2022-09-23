
public class ThreadDemo{
    public static void main(String[] args ){
         
          Thread t1= new Thread(new MultithreadDemo());
          System.out.println(t1.isAlive());
          
          
         
          
          t1.start();
         
          try{
              t1.join();
          }
          catch(InterruptedException ie){

          }
          
          NewThread t2 = new NewThread();
          t2.start();

    }
}
class NewThread extends Thread{
    NewThread(){
        super("Demo thread");
        
    }
    public void run(){
        try{
           Thread.sleep(300);
           System.out.println(currentThread().isAlive());

        }
        catch(InterruptedException e){
            System.out.println("Exception caught ");
        }
        
    }

    
}
class MultithreadDemo implements Runnable{
    public void run(){
        try{
            System.out.println("r1");
             Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println("exception is caught");
        }
    }
 }
 
