package model;

public class TKNhaCungCap122 extends NhaCungCap122 {
	private int tongtienhang;

	public TKNhaCungCap122() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TKNhaCungCap122(int id, String ten, String diachi, String sdt, String email) {
		super(id, ten, diachi, sdt, email);
		// TODO Auto-generated constructor stub
	}

	public TKNhaCungCap122(int tongtienhang) {
		super();
		this.tongtienhang = tongtienhang;
	}

	public int getTongtienhang() {
		return tongtienhang;
	}

	public void setTongtienhang(int tongtienhang) {
		this.tongtienhang = tongtienhang;
	}
	
}
