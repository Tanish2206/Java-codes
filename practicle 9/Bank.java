import java.util.*;

class Check extends Exception {
    public Check(String str) {
        super(str);
    }

}

public class Bank {
    static void Deposit(int d) throws Exception {
        if (d < 1000 || d < 0) {
            throw new Check("Minimum amount is 1000 rs ");
        }
    }

    static void Deposit1(int d, int c) throws Exception {
        if (d > c) {
            throw new Check("don't have sufficiant balance ");
        }
    }

    static void Deposit2(int e) throws Exception {
        if (e == 0 || e > 20) {
            throw new Check("enter correct id  ");
        }
    }

    public static void main(String[] args) {
        int ch;
        int amoun=0;
        Scanner sc = new Scanner(System.in);
        do {
            
        
            try {
                int choice;
                

                System.out.println("Enter the choice");
                System.out.println("1.Enter id ");
                System.out.println("2.Enter name ");
                System.out.println("3.Enter amount");

                System.out.println("4.Enter amount to withdrawal");
                choice=sc.nextInt();
                switch (choice) {
                    case 1:

                        System.out.println("enter id  ");
                        int id = sc.nextInt();

                        Deposit2(id);
                        break;
                    case 2:
                        System.out.println("enter name ");
                        String na = sc.nextLine();
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.println("enter amount ");
                         amoun = sc.nextInt();

                        Deposit(amoun);
                        break;
                    case 4:
                        System.out.println("enter amount to withdrawal ");
                        int amount = sc.nextInt();

                        Deposit1(amount,amoun);
                        break;
                    default:
                        System.out.println("Enter correct choice");

                }

            } catch (Exception e) {
                System.out.println("error catch");
                System.out.println(e);

            }
            System.out.println("press 1 to continue");
            ch = sc.nextInt();

        } while (ch == 1);

    }
}
