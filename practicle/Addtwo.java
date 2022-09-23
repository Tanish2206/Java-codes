import java.util.*;
public class Addtwo
{
public static void main(String [] args)
{
  Scanner sc= new Scanner(System.in);
  System.out.println("enter first num");
  String num1 = sc.nextLine();
  int a = Integer.parseInt(num1);

  System.out.println("enter second num");
  String num2 = sc.nextLine();
  int b = Integer.parseInt(num2);
  int sum=a+b;

  System.out.println("addition is:" + sum);
}
}