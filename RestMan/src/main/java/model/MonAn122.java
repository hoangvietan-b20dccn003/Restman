package model;

public class MonAn122 {
	private int id;
	private String ten;
	private String mota;
	private int dongia;
	private String anh;
	public MonAn122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MonAn122(int id, String ten, String mota,String anh, int dongia) {
		super();
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.dongia = dongia;
		this.anh = anh;
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
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	@Override
	public String toString() {
		return "MonAn122 [id=" + id + ", ten=" + ten + ", mota=" + mota + ", dongia=" + dongia + ", getId()=" + getId()
				+ ", getTen()=" + getTen() + ", getMota()=" + getMota() + ", getDongia()=" + getDongia()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
