package model;

public class NguyenLieuNhap122 extends NguyenLieu122 {
	private int soluong;

	public NguyenLieuNhap122() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NguyenLieuNhap122(int id, String ten, String mota, int dongia, NhaCungCap122 nhacungcap) {
		super(id, ten, mota, dongia, nhacungcap);
		// TODO Auto-generated constructor stub
	}

	public NguyenLieuNhap122(int soluong) {
		super();
		this.soluong = soluong;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
}
