import java.sql.*;
import java.util.*;


public class connection {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String pass = "prithviraj";
        try{
        Connection conn = DriverManager.getConnection(url,username,pass);

            if(conn!= null){
                System.out.println("connected");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from users");
                while(rs.next()){
                    System.out.println( rs.getInt("id") +"   " + rs.getString("first_name"));
                }
            }
        }catch(SQLException e){
            System.out.println("E rror "+ e.getMessage());
        }
    }
}
