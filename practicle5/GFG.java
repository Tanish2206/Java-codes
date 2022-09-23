import java.io.*;
public class GFG{
    public static void main(String[] args) throws IOException{
       FileReader sourcestream=null;
       try{
           sourcestream = new FileReader("sourcefile.txt");
           int temp;
           while((temp=sourcestream.read())!=-1){
               System.out.print((char)temp);
           }
       }
       finally{
           if (sourcestream!=null)
             sourcestream.close();
       }
    }
}