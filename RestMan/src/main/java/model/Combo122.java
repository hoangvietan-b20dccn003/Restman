package model;

public class Combo122 {
	private int id;
	private String ten;
	private String mota;
	private int dongia;
	private MonAn122 monan[];
	public Combo122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Combo122(int id, String ten, String mota, int dongia, MonAn122[] monan) {
		super();
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.dongia = dongia;
		this.monan = monan;
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
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public MonAn122[] getMonan() {
		return monan;
	}
	public void setMonan(MonAn122[] monan) {
		this.monan = monan;
	}
	
}
