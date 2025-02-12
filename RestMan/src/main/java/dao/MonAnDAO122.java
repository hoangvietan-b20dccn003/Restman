package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.MonAn122;

public class MonAnDAO122 extends DAO122{
	public static List<MonAn122> getDSMonAnbyTuKhoa(String key){
		List<MonAn122> dsMonAn = new ArrayList<MonAn122>();
		String query = "SELECT * FROM tblmonan122 WHERE ten LIKE ?;";
		try {
			Connection con = getConnection();
			PreparedStatement cs = con.prepareStatement(query);
			cs.setString(1, key);
			ResultSet rs = cs.executeQuery();
			System.out.println(con);
			while (rs.next()) {
            	MonAn122 x = new MonAn122();
            	x.setTen(rs.getString("ten"));
            	x.setId(rs.getInt("id"));
            	x.setMota(rs.getString("mota"));
            	x.setDongia(rs.getInt("dongia"));
            	x.setAnh(rs.getString("anh"));
            	dsMonAn.add(x);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dsMonAn;
		
	}
	public static MonAn122 getMonAn(int id) {
		MonAn122 x = new MonAn122();
		String query = "SELECT * FROM tblmonan122 WHERE id = ?;";
		try {
			Connection con = getConnection();
			PreparedStatement cs = con.prepareStatement(query);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();
			System.out.println(con);
			while (rs.next()) {
            	x.setTen(rs.getString("ten"));
            	x.setId(rs.getInt("id"));
            	x.setMota(rs.getString("mota"));
            	x.setDongia(rs.getInt("dongia"));
            	x.setAnh(rs.getString("anh"));


			}
		} catch (Exception e) {
			// TODO: handle exception
		}
			return x;
	}
	public static void main(String[] args) {
//		List<MonAn122> x =  new ArrayList<>();
//		try {
//			x = getDSMonAnbyTuKhoa("com");
////				System.out.println(x);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for (MonAn122 it : x) {
//			System.out.println(it);
//			
//		}
		MonAn122 x = new MonAn122();
		x = getMonAn(1);
		System.out.println(x);
	}
}