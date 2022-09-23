import java.util.Scanner;

class EvenOdd extends Thread
{
    public int number1, number2;

    EvenOdd(String name, int a, int b)
    {
        super(name);
        number1 = a;
        number2 = b;
    }

    public void run()
    {
        if(this.getName().equals("Add"))
        {
            System.out.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
        }
        else if(this.getName().equals("Sub"))
        {
            System.out.println("Result of " + number2 + " subtracted from " + number1 + " is " + (number1 - number2));
        }
        else if(this.getName().equals("Mul"))
        {
            System.out.println("Product of " + number1 + " and " + number2 + " is " + (number1 * number2));
        }

        try
        {
            if(this.getName().equals("Div"))
        {
            System.out.println("Quotient of " + number1 + " divided by " + number2 + " is " + (number1 / number2));
        }
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot be divided by zero");
        }
        
    }
}
 class  Calculate{
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();

        
        EvenOdd T1 = new EvenOdd("Add", a,b);
        EvenOdd T2 = new EvenOdd("Sub", a,b);
        EvenOdd T3 = new EvenOdd("Mul", a,b);
        EvenOdd T4 = new EvenOdd("Div", a,b);

        T1.start();
        T2.start();
        T3.start();
        T4.start();
        
        try
        {
            T1.join();
            T2.join();
            T3.join();
            T4.join();

        }

        catch(Exception e)
        {

        }
        System.out.println("\n\nMain thread exiting");




        sc.close();
    }
}
