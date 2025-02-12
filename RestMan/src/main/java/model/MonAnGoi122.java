package model;

public class MonAnGoi122 extends MonAn122 {
	private int soluong;

	public MonAnGoi122() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MonAnGoi122(int id, String ten, String mota, String anh, int dongia) {
		super(id, ten, mota, anh, dongia);
		// TODO Auto-generated constructor stub
	}



	public MonAnGoi122(int soluong) {
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
