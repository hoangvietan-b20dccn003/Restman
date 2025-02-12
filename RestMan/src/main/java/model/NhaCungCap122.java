package model;

public class NhaCungCap122 {
	private int id;
	private String ten;
	private String diachi;
	private String sdt;
	private String email;
	public NhaCungCap122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhaCungCap122(int id, String ten, String diachi, String sdt, String email) {
		super();
		this.id = id;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
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
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
