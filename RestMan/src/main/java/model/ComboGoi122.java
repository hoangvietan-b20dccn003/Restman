package model;

public class ComboGoi122 extends Combo122 {
	private int soluong;

	public ComboGoi122() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComboGoi122(int id, String ten, String mota, int dongia, MonAn122[] monan) {
		super(id, ten, mota, dongia, monan);
		// TODO Auto-generated constructor stub
	}

	public ComboGoi122(int soluong) {
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
