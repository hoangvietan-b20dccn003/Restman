package model;

import java.util.Date;

public class ThanhVien122{
	private int id;
	private String ten;
	private String username;
	private String password;
	private String diachi;
	private Date ngaysinh;
	private String email;
	private String sodienthoai;
	public ThanhVien122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ThanhVien122(int id, String ten, String username, String password, String diachi, Date ngaysinh,
			String email, String sodienthoai) {
		super();
		this.id = id;
		this.ten = ten;
		this.username = username;
		this.password = password;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
		this.email = email;
		this.sodienthoai = sodienthoai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	
}