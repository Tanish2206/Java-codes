
class MultithreadDemo1 implements Runnable{
   public void run(){
       try{
           System.out.println("thread "+Thread.currentThread()+"is running");
       }
       catch(Exception e){
           System.out.println("exception is caught");
       }
   }
}
class MultithreadInterface {
    public static void main(String[] args ){
        int n=8;
        for (int i=0;i<n;i++){
            Thread object =new Thread(new MultithreadDemo1());
            object.start();
        }
    }
}
