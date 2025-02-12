package model;

public class Ban122 {
	private int id;
	private String soban;
	private NhaHang122 nhahang;
	public Ban122() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ban122(int id, String soban, NhaHang122 nhahang) {
		super();
		this.id = id;
		this.soban = soban;
		this.nhahang = nhahang;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getSoban() {
		return soban;
	}
	public void setSoban(String soban) {
		this.soban = soban;
	}
	public NhaHang122 getNhahang() {
		return nhahang;
	}
	public void setNhahang(NhaHang122 nhahang) {
		this.nhahang = nhahang;
	}
	
	
}
