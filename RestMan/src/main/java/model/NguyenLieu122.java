package model;
public class NguyenLieu122{
	private int id;
	private String ten;
	private String mota;
	private int dongia;
	private NhaCungCap122 nhacungcap;
	public NguyenLieu122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NguyenLieu122(int id, String ten, String mota, int dongia, NhaCungCap122 nhacungcap) {
		super();
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.dongia = dongia;
		this.nhacungcap = nhacungcap;
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
	public NhaCungCap122 getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(NhaCungCap122 nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	
	
}