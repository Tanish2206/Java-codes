import java.util.*;
public class Try1{
 public static void main(String[] args ){
     
     try
     {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
        int num1=sc.nextInt();
        System.out.println("enter the second  no");
        int num2 =sc.nextInt();
        int arr[]= new int[3];
        System.out.println(arr[4]);


      
        System.out.println(num1+"/"+num2+"="+(num1/num2));
     }
     catch(IndexOutOfBoundsException e1)
     {
        System.out.println("Index out of bound Exception");
     }
     
     catch(ArithmeticException e1)
     {
        System.out.println("Arithematic Exception");
     }
     catch(InputMismatchException e2){
      System.out.println("wrong input");
     }
     catch(Exception e)
     {
        System.out.println(" Exception");
     }
     

     
    }
}
