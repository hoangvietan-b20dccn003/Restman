package dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DAO122 {
    public static Connection con;

    public DAO122(){
        
    }
    
    public static Connection getConnection() {
    	if (con == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/restman";
            String dbClass = "com.mysql.cj.jdbc.Driver"; // Sử dụng lớp trình điều khiển mới

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "root", "Diepdz123..");
                System.out.println("Connected to the database.");
                System.out.println(con);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Failed to connect to the database.");
            }
        }
    	return con;
    }

//    public static void main(String[] args)  {
//        DAO122 dao = new DAO122(); 
//        Connection con = getConnection();
//        System.out.println(con);
//    }
}
