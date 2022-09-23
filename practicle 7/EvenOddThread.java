import java.util.Scanner;

class EvenOdd extends Thread
{
    public int number;

    EvenOdd(String name, int a)
    {
        super(name);
        number = a;
    }

    public void run()
    {
        if(this.getName().equals("Odd"))
        {
            for(int i = 1; i<= number; i = i+2)
            System.out.print(i + " ");
        }
        else
        {
            for(int i = 2; i<= number; i = i+2)
            System.out.print(i + " ");
        }
    }
}

public class EvenOddThread {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the end point");
        int n = sc.nextInt();

        
        EvenOdd T1 = new EvenOdd("Even", n);
        EvenOdd T2 = new EvenOdd("Odd", n);

        T1.start();
        T2.start();
        
        try
        {
            T1.join();
            T2.join();
        }

        catch(Exception e)
        {

        }
        System.out.println("\n\nMain thread exiting");




     sc.close();
    }
}
