package model;

import java.util.Date;

public class TheThanhVien122 extends KhachHang122 {
	private String loaithe;
	private Date date;
	public TheThanhVien122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TheThanhVien122(String loaithe, Date date) {
		super();
		this.loaithe = loaithe;
		this.date = date;
	}
	public String getLoaithe() {
		return loaithe;
	}
	public void setLoaithe(String loaithe) {
		this.loaithe = loaithe;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
