import java.util.*;
public class Perfectnum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num");
        String num1 = sc.nextLine();
        int a = Integer.parseInt(num1);
        
        int sum=0;
        for (int i=1;i<a;i++)
        {
            if(a%i==0){
                sum=sum+i;
            }
        }
        if(a==sum)
            System.out.println("Perfect number");
        else
           System.out.println("not a Perfect number"); 
         
        
    }
}