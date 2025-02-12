package model;

public class TKMonAn122 extends MonAn122 {
	private int doanhthu;
	private int soluongban;
	public TKMonAn122() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TKMonAn122(int id, String ten, String mota, String anh, int dongia) {
		super(id, ten, mota, anh, dongia);
		// TODO Auto-generated constructor stub
	}

	public TKMonAn122(int doanhthu, int soluongban) {
		super();
		this.doanhthu = doanhthu;
		this.soluongban = soluongban;
	}
	public int getDoanhthu() {
		return doanhthu;
	}
	public void setDoanhthu(int doanhthu) {
		this.doanhthu = doanhthu;
	}
	public int getSoluongban() {
		return soluongban;
	}
	public void setSoluongban(int soluongban) {
		this.soluongban = soluongban;
	}
	
}
