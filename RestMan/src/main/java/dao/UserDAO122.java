package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO122 extends DAO122 {

	public static String getUserRole(String username, String password) {

		String query = "SELECT role FROM restman.tbluser122 WHERE username = ? AND password = ?;";

		

		try {
			Connection con = getConnection();
			PreparedStatement cs = con.prepareStatement(query);
			cs.setString(1, username);
			cs.setString(2, password);
			ResultSet rs = cs.executeQuery();
			System.out.println(username + password);

			if (rs.next()) {
//            	System.out.println(rs.next());

				return rs.getString("role");

			}

		} catch (Exception e) {
//        	System.out.println("loi r");
			e.printStackTrace();
		}
		return null;
	}

//	public static void main(String[] args) {
//		String x =  null;
//		try {
//			x = getUserRole("abc", "123");
////				System.out.println(x);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(x);
//	}
}
