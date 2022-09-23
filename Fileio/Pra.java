import java.util.*;
import java.io.*;

public class Pra {
    public static void main(String args[]) {
        File f1 = new File("D:\\Java programming\\Fileio\\hello.txt");
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("good.txt"));
            Scanner sc = new Scanner(System.in);
            String h = sc.nextLine();
            write.write("how are you");
            write.write("\nyou look good");
            write.write("\n" + h);
            write.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            if(f1.delete()){
                System.out.println("deleted");
            }
            else{
                System.out.println("not deleted");
            }
            BufferedReader reader = new BufferedReader(new FileReader("good.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
