import java.io.*;
public class GFG2{
    public static void main(String[] args) throws IOException{
       FileReader sourcestream=null;
       FileWriter targetstream=null;
       try{
           sourcestream = new FileReader("sourcefile.txt");
           targetstream = new FileWriter("output.txt");
           int temp;
           while((temp=sourcestream.read())!=-1){
            targetstream.write((char)temp);
           }
       }
       finally{
           if (sourcestream!=null)
             sourcestream.close();
           if (targetstream!=null)
             targetstream.close();
       }
    }
}