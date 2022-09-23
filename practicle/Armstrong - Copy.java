import java.util.*;
public class Armstrong {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        String num1 = sc.nextLine();
        int a = Integer.parseInt(num1);

        int originalNumber, remainder, result = 0;

        originalNumber = a;
        int flag =0;
        
        if (a>=100 && a<=999){

             while (originalNumber != 0)
           {
            remainder = originalNumber % 10;
            result = result + (remainder*remainder*remainder);
            originalNumber /= 10;
           }
        }
        else{
          System.out.println(" enter the correct number.");
          flag =1;
        }  
        
        
       if (flag ==0)
       {
        if(result == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
       }        
    }
}