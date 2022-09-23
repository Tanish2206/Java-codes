import java.util.*;
class Employee{
    int id;
    double salary;
    double Salary;
    String name;
    double totalsalary;
    double hra;
    String type;

  void getdata(){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the id");
      this.id = sc.nextInt();
      sc.nextLine();

      System.out.println("enter Name ");
      this.name=sc.nextLine();

      System.out.println("enter Salary");
     this.salary=sc.nextDouble();

    }  
  void display(){
      System.out.print(id);
      System.out.print("\t\t"+name);
      System.out.print("\t\t"+salary);
      System.out.print("\t\t\t\t"+Salary);
      System.out.print("\t\t\t"+hra);
      System.out.print("\t\t\t"+totalsalary);
      System.out.print("\t\t\t"+type);
      System.out.println();

    } 
  void display2(){
      System.out.print("Id :");
      System.out.print("\t\tName :");
      System.out.print("\t\tSalary :");
      System.out.print("\t\tincremented salary: ");
      System.out.print("\t\tHRA:");
      System.out.print("\t\t\tTotal Salary:");
      System.out.println("\t\tType");
  }  
     

}

class fulltime extends Employee
{
    
   
    void calculate(){
         Salary = super.salary*(50.0/100.0);
         hra = 0.25*super.salary;
         totalsalary = salary+ Salary + hra;
         type = "Full time employee ";
    }
}

class intern extends Employee{
    void calculate(){
         Salary = super.salary*(25.0/100.0);
         hra = 0.25*super.salary;
         totalsalary = salary+ Salary + hra;
         type = "Intern employee ";
    }
}

class prac3{
    public static void main(String args[]){
        /*
      

      obj.display();*/
     int n,m;
     System.out.println("Enter no of full time employes");
     Scanner sc= new Scanner(System.in);
     n=sc.nextInt();
     fulltime[] f1=new fulltime[n];
     System.out.println("Enter no of intern employes");
     m=sc.nextInt();
     intern[] f2=new intern[m];
      int ch,choice;
     Employee f3=new Employee(); 
      do{
          
          System.out.println("1.ENTER FULL TIME EMPLOYEE");
          System.out.println("2.ENTER INTERN EMPLOYEE ");
          System.out.println("3.DISPLAY DETAILS(FTE) ");
          System.out.println("4.DISPLAY DETAILS OF INTERN  ");
          System.out.println("enter choice ");
          ch=sc.nextInt();

          switch(ch){
              case 1:
                   
                   for(int i=0;i<n;i++)
                   {   f1[i]=new fulltime();
                       f1[i].getdata();
                       f1[i].calculate();
                   }
                     break;
               case 2:
                   
                    
                   for(int i=0;i<m;i++)
                   {   f2[i]=new intern();
                       f2[i].getdata();
                       f2[i].calculate();
                   }
                   break;
               case 3:
                     f3.display2();
                    for(int i=0;i<n;i++)
                   {
                       f1[i].display();
                       
                   }
                     break;  
               case 4:
                     f3.display2();
                     for(int i=0;i<m;i++)
                   {
                       f2[i].display();
                       
                   }
                     break; 
              default :
                   System.out.println("enter valid input ");     
                        
               
                
            }
            System.out.println(" press 1 to continue and 0 to exit ");
            choice = sc.nextInt();


        }while(choice == 1);
                    
    }

    
}