import java.io.*;

public class lab44 {

	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader iar=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(iar);
		FileWriter file = new FileWriter("Student.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		System.out.println("enter the total numbers of student:- ");
		int student=Integer.parseInt(br.readLine());
		int[] marks=new int[5];
		int[] total=new int[student];
		int[] avg=new int[student];
		
		for(int i=0;i<student;i++)
		{
			total[i]=0;
		}
		

	
		String[] name=new String[student];
		String[] roll=new String[student];
		String[] grade=new String[student];
		for(int i=0;i<student;i++)
		{
			System.out.println("enter the name of student"+(i+1)+":-");
			name[i]=br.readLine();
			buffer.write("\nname is:- "+name[i]+"\n");
			System.out.println("enter the roll of student:- ");
			roll[i]=br.readLine();
			buffer.write("roll no:- "+roll[i]);
			for(int j=0;j<5;j++)
			{
				System.out.println("enter the marks of subject"+(j+1)+":- ");
				marks[j]=Integer.parseInt(br.readLine());
				total[i]+=marks[j];
				buffer.write("\n"+marks[j]);
			}
			avg[i]=total[i]/5;
			
			
			if(avg[i]>=90)
			{
				grade[i]="\nA";
				buffer.write(grade[i]);
			}
			else if(avg[i]>=60 && avg[i]<90)
			{
				grade[i]="\nB";
				buffer.write(grade[i]);
				
				
			}
			else if(avg[i]>=40 && avg[i]<60)
			{
				grade[i]="\nC";
				buffer.write(grade[i]);
				
			}
			else
			{
				grade[i]="\nF";
				buffer.write(grade[i]);
				
				
			}
				}
		
		

		br.close();
		iar.close();
	
        buffer.close();
		
		
		
		}
	    
	
	
	
	
	

}