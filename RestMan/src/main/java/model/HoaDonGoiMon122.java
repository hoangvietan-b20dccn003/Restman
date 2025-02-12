package model;

public class HoaDonGoiMon122 {
	private int id;
	private int thanhtien;
	private float khuyenmai;
	private NhanVienBanHang122 nhanvienbanhang;
	private ComboGoi122[] combo;
	private MonAnGoi122[] monan;
	private Ban122 ban;
	public HoaDonGoiMon122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDonGoiMon122(int id, float khuyenmai, NhanVienBanHang122 nhanvienbanhang,
			ComboGoi122[] combo, MonAnGoi122[] monan, Ban122 ban) {
		super();
		this.id = id;
		this.khuyenmai = khuyenmai;
		this.nhanvienbanhang = nhanvienbanhang;
		this.combo = combo;
		this.monan = monan;
		int thanhtien = 0;
		float giamonan = 0;
		float giacombo = 0;
		for (MonAnGoi122 x : monan) {
			giamonan = x.getDongia()*x.getSoluong();
		}
		for (ComboGoi122 x : combo) {
			giacombo = x.getDongia()*x.getSoluong();
		}
		thanhtien = (int)((giamonan + giacombo)*khuyenmai);
		this.thanhtien = thanhtien;
		this.ban = ban;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(int thanhtien) {
		this.thanhtien = thanhtien;
	}
	public float getKhuyenmai() {
		return khuyenmai;
	}
	public void setKhuyenmai(float khuyenmai) {
		this.khuyenmai = khuyenmai;
	}
	public NhanVienBanHang122 getNhanvienbanhang() {
		return nhanvienbanhang;
	}
	public void setNhanvienbanhang(NhanVienBanHang122 nhanvienbanhang) {
		this.nhanvienbanhang = nhanvienbanhang;
	}
	public ComboGoi122[] getCombo() {
		return combo;
	}
	public void setCombo(ComboGoi122[] combo) {
		this.combo = combo;
	}
	public MonAnGoi122[] getMonan() {
		return monan;
	}
	public void setMonan(MonAnGoi122[] monan) {
		this.monan = monan;
	}
	public Ban122 getBan() {
		return ban;
	}
	public void setBan(Ban122 ban) {
		this.ban = ban;
	}
	
}
