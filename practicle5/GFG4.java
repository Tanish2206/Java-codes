import java.io.*;
class GFG4 {
    public static void main(String[] args) throws IOException
    {
        
   
           DataInputStream sourceStream=null;
           DataOutputStream targetStream=null;
            
    
          
        
           sourceStream=new DataInputStream(name);
           targetStream =new DataOutputStream("Data.txt");

        
         int temp;
         while((temp=sourceStream.read())!=-1){
            targetStream.write((byte)temp);
         }
          
        
        
            if (sourceStream!=null)
                 sourceStream.close();
            if (targetStream!=null)
                 targetStream.close();     
        
    }
}