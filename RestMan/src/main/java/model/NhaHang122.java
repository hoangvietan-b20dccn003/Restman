package model;

public class NhaHang122 {
	private int id;
	private String ten;
	private String diachi;
	private String mota;
	private String sodienthoai;
	public NhaHang122(int id, String ten, String diachi, String mota, String sodienthoai) {
		super();
		this.id = id;
		this.ten = ten;
		this.diachi = diachi;
		this.mota = mota;
		this.sodienthoai = sodienthoai;
	}
	public NhaHang122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
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
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
}
