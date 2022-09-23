import java.io.*;
class GFG3 {
    public static void main(String[] args) throws IOException{
   
           FileInputStream sourceStream=null;
           FileOutputStream targetStream=null;
            
    
    try{ 
           sourceStream=new FileInputStream("hello.jpeg");
           targetStream =new FileOutputStream("image.jpeg");

        
          int temp;
         while((temp=sourceStream.read())!=-1){
            targetStream.write(temp);
         }
          
        } 
        finally{
            if (sourceStream!=null)
                 sourceStream.close();
            if (targetStream!=null)
                 targetStream.close();     
        }
    }
}