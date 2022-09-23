import java.util.*;
 class complex{

     private int real,imaginary;
    
   complex add(complex a, complex b)
    {
        complex c=new complex();
        c.real=a.real+b.real;
        c.imaginary=a.imaginary+b.imaginary;
        return c;
    }

     complex sub(complex a,complex b)
    {
        complex c=new complex();
        c.real=a.real - b.real;
        c.imaginary=a.imaginary-b.imaginary;
        return c;
    }
    void put(int r, int i){
        real=r;
        imaginary=i;
    }
    void show(){
        System.out.println(real +" + "+ "i"+imaginary);
    }
}
class Complexx{
    public static void main(String[] args){
        int r,i;
        complex c1 = new complex();
        complex c2 = new complex();
        complex c3= new complex();
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real part of num1 : ");
        r = sc.nextInt();
        System.out.println("Enter the imaginary part of num1 : ");
        i = sc.nextInt();
        c1.put(r, i);
        c1.show();

        System.out.println("\n\nEnter the real part of num2 : ");
        r = sc.nextInt();
        System.out.println("Enter the imaginary part of num2 : ");
        i = sc.nextInt();
        c2.put(r, i);
        c2.show();

        complex res = c3.add(c1, c2);
        complex reb = c3.sub(c1, c2);

        System.out.println("\n\nThe addition of num1 and num2 is ");
        res.show();
        System.out.println("The subtraction of num1 and num2 is ");
        reb.show();
        sc.close();
    }
}