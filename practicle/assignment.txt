import java.util.Scanner;

class Student{
    private String name;
    private int roll_no;
    private float[] marks = new float[5];
    private float avg,percentage;
    private char grade;

    Student(String name,int roll_no,float[] marks){
        this.name = name;
        this.roll_no = roll_no;
        for(int i=0;i<5;i++){
            this.marks[i] = marks[i];
        }
    }

    void setAvg(float a){
        avg = a;
    }
    void setPercentage(float a){
        percentage = a;
    }
    void setgrade(char a){
        grade = a;
    }

    float getAvg(){
        return avg;
    }
    float getPercentage(){
        return percentage;
    }
    char getgrade(){
        return grade;
    }

    float[] getMarks(){
        return marks;
    }

    void display(){
        System.out.println("\nName : " + name);
        System.out.println("Roll No : " + roll_no);
        System.out.println("Average : " + avg);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
        System.out.println();
    }
}

class Calculate{
    void average(Student s){
        float[] marks = s.getMarks();
        float sum = 0;
        for(int i=0;i<5;i++){
            sum += marks[i];
        }
        s.setAvg(sum/5);
        s.setPercentage((sum/500)*100);
        if(s.getPercentage() >= 85){
            s.setgrade('A');
        }else if((s.getPercentage() >= 75) && (s.getPercentage() < 85)){
            s.setgrade('B');
        }else if((s.getPercentage() >= 55) && (s.getPercentage() < 75)){
            s.setgrade('C');
        }else{
            s.setgrade('F');
        }
    }
}

public class Prac2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int N = in.nextInt();
        Student[] s = new Student[N];
        String name;
        int roll_no,ch;
        float[] marks = new float[5];

        do{
            System.out.print("\n-----MENU-----\n1. Enter Student Details\n2. Display Students Information\n3. Exit\n");
            System.out.print("Enter Choice : ");
            ch = in.nextInt();
            switch(ch){
                case 1:
                    for(int i=0;i<N;i++){
                        in.nextLine();
                        System.out.print("\nEnter name : ");
                        name = in.nextLine();
                        System.out.print("Enter roll no : ");
                        roll_no = in.nextInt();
                        System.out.print("Enter marks : ");
                        for (int j = 0; j < 5; j++) {
                            marks[j] = in.nextFloat();
                        }
                        s[i] = new Student(name, roll_no, marks);
                        Calculate tempStud = new Calculate();
                        tempStud.average(s[i]);
                    }
                    break;
    
                case 2:
                    for(int i=0;i<N;i++){
                        s[i].display();
                    }
                    break;
    
                case 3:
                    System.exit(0);
                
                default:
                    System.out.println("\nInvalid Choice!!");
            }
            System.out.print("Do you want to continue(1/0) : ");
            ch = in.nextInt();
        }while(ch == 1);
        in.close();
    }
}