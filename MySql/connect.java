import java.sql.*;
import java.util.Scanner;

class Connect {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter roll number");
            String a = sc.nextLine();
            System.out.println("enter name");

            String n = sc.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Tanish22@");
            Statement stmt = con.createStatement();
            String str = "INSERT INTO student VALUES(" + a + ",'" + n + "')";

            System.out.println(str);

            stmt.execute(str);
            ResultSet rs = stmt.executeQuery("select * from  student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}