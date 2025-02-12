package model;

public class TKNguyenLieu122 extends NguyenLieu122 {
	private int tongtien;

	public TKNguyenLieu122() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TKNguyenLieu122(int id, String ten, String mota, int dongia, NhaCungCap122 nhacungcap) {
		super(id, ten, mota, dongia, nhacungcap);
		// TODO Auto-generated constructor stub
	}

	public TKNguyenLieu122(int tongtien) {
		super();
		this.tongtien = tongtien;
	}

	public int getTongtien() {
		return tongtien;
	}

	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	
}
