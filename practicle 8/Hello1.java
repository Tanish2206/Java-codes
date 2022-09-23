import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
class Addition implements Runnable{
    int num1,num2;
    Addition(int a,int b){
           num1=a;
           num2=b;
    }
    public void run(){
          try{
              System.out.println("sum of two numbers is"+(num1+num2));
          }
          catch(Exception e){
             System.out.println("exception caught");
          }
    }
}
class Subtraction implements Runnable{
    int num1,num2;
    Subtraction(int a,int b){
           num1=a;
           num2=b;
    }
    public void run(){
          try{
              System.out.println("difference of two numbers is"+(num1-num2));
          }
          catch(Exception e){
             System.out.println("exception caught");
          }
    }
}

class Multiplication implements Runnable{
    int num1,num2;
    Multiplication(int a,int b){
           num1=a;
           num2=b;
    }
    public void run(){
          try{
              System.out.println("product of two numbers is"+(num1*num2));
          }
          catch(Exception e){
             System.out.println("exception caught");
          }
    }
}
class Division implements Runnable{
    int num1,num2;
    Division(int a,int b){
           num1=a;
           num2=b;
    }
    public void run(){
          try{
              System.out.println("division of two numbers is"+(num1/num2));
          }
          catch(Exception e){
             System.out.println("exception caught");
             System.out.println(e);
          }
    }
}
class Hello1{
    public static void main(String[] args){
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();

        Thread t1=new Thread(new Addition(num1,num2));
        t1.start();
        Thread t2=new Thread(new Subtraction(7,5));
        t2.start();
        Thread t3=new Thread(new Multiplication(5,7));
        t3.start();
        Thread t4=new Thread(new Division(5,0));
        t4.start();

    }

}

