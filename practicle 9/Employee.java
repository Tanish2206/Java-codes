import java.util.*;
class Check extends Exception{
    public Check(String str){
        super(str);
    }

}

public class Employee
{
    static void Validateage(int age) throws Exception {
        if(age<25||age>60)
        {
               throw new Check("age is not valid ");
        }
    }
    static void Validatena(String s) throws Exception{
        int flag =0;
        char [] ou =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(((int)ou[i]>=65&& (int)ou[i]<=90)|| ((int)ou[i]>=97&& (int)ou[i]<=122))
                continue;
            
            else
                throw new Check("enter valid name ");
            
        }
    }
    
    public static void main(String[] args){
        
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age of employee");
        int age=sc.nextInt();
        sc.nextLine();
        Validateage(age);
       
        
        System.out.println("enter name of employee");
        String na=sc.nextLine();
        
        Validatena(na);
    }
    catch(Exception e){
          System.out.println("error catch");
          System.out.println(e);
          
    }
  } 
}

