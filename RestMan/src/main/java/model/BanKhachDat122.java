package model;

import java.util.Date;

public class BanKhachDat122 extends Ban122 {
	private Date date;
	private KhachHang122 khachhang;
	private MonAnGoi122 monandat;
	private ComboGoi122 combodat;
	public BanKhachDat122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BanKhachDat122(int id, String soban, NhaHang122 nhahang) {
		super(id, soban, nhahang);
		// TODO Auto-generated constructor stub
	}
	public BanKhachDat122(Date date, KhachHang122 khachhang, MonAnGoi122 monandat, ComboGoi122 combodat) {
		super();
		this.date = date;
		this.khachhang = khachhang;
		this.monandat = monandat;
		this.combodat = combodat;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public KhachHang122 getKhachhang() {
		return khachhang;
	}
	public void setKhachhang(KhachHang122 khachhang) {
		this.khachhang = khachhang;
	}
	public MonAnGoi122 getMonandat() {
		return monandat;
	}
	public void setMonandat(MonAnGoi122 monandat) {
		this.monandat = monandat;
	}
	public ComboGoi122 getCombodat() {
		return combodat;
	}
	public void setCombodat(ComboGoi122 combodat) {
		this.combodat = combodat;
	}
	
}
